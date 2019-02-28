package com.scp.constants;


public class ValidationMessages {
public static void validationMessages(){
	
}

}
class ValidationException extends RuntimeException{
	String errorMessage;

	public ValidationException(String errorMessage) {
		super(errorMessage);
		this.errorMessage = errorMessage;
	}
}