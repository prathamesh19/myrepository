package com.prathamesh.constants;

public interface AppLevelConstants {

	String LOGIN_SUCCESS = "Success";
	String USERNAME_CANNOT_BE_EMPTY = "UserName cannot be Empty";
	String PASSWORD_CANNOT_BE_EMPTY = "Password cannot be Empty";
	String INVALID_USERNAME_PASSWORD = "Invalid Credentials";
			
	
	enum StudFields{
		studId,
		studUserName,
		studPassword,
		isActive
	}
}