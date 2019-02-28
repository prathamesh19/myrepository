package com.prathamesh.student.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.prathamesh.constants.AppLevelConstants;
import com.prathamesh.constants.AppLevelConstants.StudFields;
import com.prathamesh.entities.StudentEntity;
import com.prathamesh.pojos.StudentPojo;
import com.prathamesh.student.service.StudentService;
import com.prathamesh.util.HibernateUtil;

public class StudentServiceImpl implements StudentService {

static SessionFactory sessionFactory = null;
	
	static {
		sessionFactory = HibernateUtil.getSessionFactory();
	}
	
	public boolean addStudent(StudentPojo student) {
		Session session = null;
		Transaction transcation =null;
		try{
			session = sessionFactory.openSession();
			transcation = session.beginTransaction();	
			int id = (Integer)session.save(mapPojoToEntity(student)); //
			HibernateUtil.flushNCommit(session, transcation);
			return id!=0;
		}catch(Exception e){
			transcation.rollback(); 
		}finally{
			HibernateUtil.closeSession(session); 
		}
		return false;
	}

	public boolean deleteStudent(int studId) {
		Session session = null;
		Transaction transcation = null;

		try {
			session = sessionFactory.openSession();
			transcation = session.beginTransaction();
			StudentEntity dbEntity = session.get(StudentEntity.class, studId);
			if (dbEntity == null)
				return false;
			session.delete(dbEntity);//UPDATE
			HibernateUtil.flushNCommit(session, transcation);
			return true;

		} catch (Exception e) {
			transcation.rollback();
			
		}finally{
			HibernateUtil.closeSession(session);
		}
		return false;
	}

	public StudentPojo getStudent(int studId) {
		Session session = null;
		Transaction transcation = null;
		try {
			session = sessionFactory.openSession();
			transcation = session.beginTransaction();
			return mapEntityToPojo(session.get(StudentEntity.class,studId));
		} catch (Exception e) {
			transcation.rollback();
		}finally{
			HibernateUtil.closeSession(session);
		}
		return null;
	}

	public boolean updateStudent(StudentPojo student) {
		Session session = null;
		Transaction transcation =null;
		try{
			session = sessionFactory.openSession();
			transcation = session.beginTransaction();	
			StudentEntity entity = (StudentEntity) session.merge(mapPojoToEntity(student)); //
			HibernateUtil.flushNCommit(session, transcation);
			return entity!=null;
		}catch(Exception e){
			transcation.rollback(); 
		}finally{
			HibernateUtil.closeSession(session); 
		}
		return false;
	}

	public List<StudentPojo> getAllStudents() {
		Session session = null;
		Transaction transcation = null;
		try {
			session = sessionFactory.openSession();
			transcation = session.beginTransaction();
			
			@SuppressWarnings("unchecked")
			List<StudentEntity> listOfStudEnties = session.createQuery("from StudentEntity").list();
			return mapListOfEntitiesToListOfPojo(listOfStudEnties);
			//HQL -- Class -- Class chya fields
			//SQL -- Table -- table che columns
		} catch (Exception e) {
			transcation.rollback();
		}finally{
			HibernateUtil.closeSession(session);
		}
		return null;
	
		
	}

	
	public static void main(String[] args) {
		StudentServiceImpl impl = new StudentServiceImpl();
		
		HashMap<AppLevelConstants.StudFields, String> hmap = new HashMap<AppLevelConstants.StudFields, String>();
		hmap.put(AppLevelConstants.StudFields.studId, "10");
		hmap.put(AppLevelConstants.StudFields.isActive, "true");
		
		String hqlQuery = "from StudentEntity " + impl.prepareWhereCondition(hmap);
		System.out.println(hqlQuery);
	}
	
	
	
	
	public List<StudentPojo> searchEmp(HashMap<AppLevelConstants.StudFields, String> searchCriteria) {
		Session session = null;
		Transaction transcation = null;
		try {
			session = sessionFactory.openSession();
			transcation = session.beginTransaction();
			Query query = session.createQuery( "from StudentEntity where studId =: empId  and isActive=:isActive");
			
			Set<Entry<AppLevelConstants.StudFields, String>> entrySet = searchCriteria.entrySet();
			for (Entry<AppLevelConstants.StudFields, String> entry : entrySet) {
						if(entry.getKey().equals(AppLevelConstants.StudFields.studId))
							query.setInteger(entry.getKey().toString(), Integer.parseInt(entry.getValue()));
						if(entry.getKey().equals(AppLevelConstants.StudFields.isActive)){
							query.setString(entry.getKey().toString(),  entry.getValue().toString());
						}
						if(entry.getKey().equals(AppLevelConstants.StudFields.studPassword)){
							query.setString(entry.getKey().toString(),  entry.getValue().toString());
						}
						if(entry.getKey().equals(AppLevelConstants.StudFields.studUserName)){
							query.setString(entry.getKey().toString(),  entry.getValue().toString());
						}
			}
			
			System.out.println(query.getQueryString());
			System.out.println("Query list -- " +query.list());
			
			return query.list();
		} catch (Exception e) {
			e.printStackTrace();
			
			transcation.rollback();
		}finally{
			HibernateUtil.closeSession(session);
		}
		return null;
		
	}

	
	private String prepareWhereCondition(HashMap<AppLevelConstants.StudFields, String> searchCriteria) {

		String whereCondition = "";
		Set<Entry<AppLevelConstants.StudFields, String>> entrySet = searchCriteria.entrySet();
		for (Entry<AppLevelConstants.StudFields, String> entry : entrySet) {
			
			AppLevelConstants.StudFields field = entry.getKey(); //param 
			String value = entry.getValue() ;// param value
			
					if (AppLevelConstants.StudFields.studId.toString().equals(field.toString())){
						try{
							int val = Integer.parseInt(value);
							whereCondition += "where "+AppLevelConstants.StudFields.studId.toString() +"="+val;
						}catch(NumberFormatException e){
							System.out.println("Invalid studId");
						}
					}
					
					
					if (AppLevelConstants.StudFields.isActive.toString().equals(field.toString())){
						try{
							boolean val = Boolean.parseBoolean(value);
							String yesOrNo = val ? "Yes" :"No";
							whereCondition += " and "+ AppLevelConstants.StudFields.isActive.toString() +"= '"+ yesOrNo +"'";
						}catch(NumberFormatException e){
							System.out.println("Invalid studId");
						}
					}
					
					
		}
		return whereCondition;
		
	}

	private List<StudentPojo> mapListOfEntitiesToListOfPojo(List<StudentEntity> listOfStudEntities){
		List<StudentPojo> listOfPojos =null;
		if(listOfStudEntities==null || listOfStudEntities.isEmpty()){
			return null;
		}else{
			 listOfPojos = new ArrayList<StudentPojo>();
			for (StudentEntity  entity : listOfStudEntities) {
				listOfPojos.add(mapEntityToPojo(entity));
			}
		}
		return listOfPojos;
	}
	
	private StudentPojo mapEntityToPojo(StudentEntity studentEntity){
		if(studentEntity==null)
			return null;
		
		StudentPojo pojo = new StudentPojo();
		pojo.setStudId(studentEntity.getStudId());
		pojo.setActive(studentEntity.getIsActive().equals("Yes"));
		pojo.setStudPassword(studentEntity.getStudPassword());
		pojo.setStudUserName(studentEntity.getStudUserName());
		return pojo;
	}
	
	private StudentEntity mapPojoToEntity(StudentPojo studentPojo){
		if(studentPojo==null)
			return null;
		StudentEntity entity = new StudentEntity();
		entity.setStudId(studentPojo.getStudId());
		String yesOrNo = studentPojo.isActive() ? "Yes" : "No";
		entity.setIsActive(yesOrNo);
		entity.setStudPassword(studentPojo.getStudPassword());
		entity.setStudUserName(studentPojo.getStudUserName());
		return entity;
	}

	public List<StudentPojo> searchStudent(HashMap<StudFields, String> searchCriteria) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
