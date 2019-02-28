package com.prathamesh.serialization_demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TestSerialization {
public static void main(String[] args) throws IOException, ClassNotFoundException{
A a=new A(1000);
File file=new File("F:\\ser.txt");
FileOutputStream fos=new FileOutputStream(file);
ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(a);
System.out.println("After Serialization----" + a);
oos.close();
fos.close();

File file1=new File("F:\\ser.txt");
FileInputStream fis=new FileInputStream(file1);
ObjectInputStream ois=new ObjectInputStream(fis);
A a1=(A)ois.readObject();
System.out.println("After De-Serialization-------" + a1);
ois.close();
fis.close();	
}


}
class A implements Serializable{
private int aId;
private void writeObject(ObjectOutputStream os) throws Exception{
	os.defaultWriteObject();
	System.out.println(os);
	int eaId=aId+300;
	os.writeObject(eaId);
	System.out.println(eaId);
}
private void readObject(ObjectInputStream is) throws Exception{
	is.defaultReadObject();
	System.out.println(is);
	int id=(int)is.readObject();
	aId=id-300;
	System.out.println(aId);
}
public A() {
	super();
	// TODO Auto-generated constructor stub
}
public A(int aId) {
	super();
	this.aId = aId;
}
public int getaId() {
	return aId;
}
public void setaId(int aId) {
	this.aId = aId;
}
@Override
public String toString() {
	return "A [aId=" + aId + "]";
}
}
