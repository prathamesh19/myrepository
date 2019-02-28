package com.prathamesh.program;

import java.util.Random;

public class TestMain {
	public static void main(String[] args) 
	{
		// Length of your password as I have choose
        // here to be 8
		
		int min=6;
		int max=15;
		String psw_type="HIGH";
        //int length=4;
		
        int len=0;
        
        Random random=new Random();
        len=random.nextInt((max-min)+1)+min;
        System.out.println(len);
        //System.out.println("length"+len);
        
        
       // System
        System.out.println(generate_Password(len,psw_type));
    }
 
    // This our Password generating method
    // We have use static here, so that we not to
    // make any object for it
	
	
    static char[] generate_Password(int len,String psw_type)
    {
        System.out.println("Generating password using random() : ");
        System.out.print("Your new password is : ");
 
        // A strong password has Cap_chars, Lower_chars,
        // numeric value and symbols. So we are using all of
        // them to generate our password
        
        
        String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_chars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*_=+-/.?<>";
        String values="";
         if(psw_type=="LOW")
         {
        	 values = Capital_chars + Small_chars;
         }
         else if(psw_type=="MEDIUM")
         {
        	 values = Capital_chars + Small_chars +
                     numbers;
         }
         else if(psw_type=="HIGH")
         {
        	  values = Capital_chars + Small_chars +
                     numbers + symbols;
         }
        // Using random method
        Random rndm_method = new Random();
 
        char[] password = new char[len];
        
        for (int i = 0; i < len; i++)
        {
            // Use of charAt() method : to get character value
            // Use of nextInt() as it is scanning the value as int
        	
        	//System.out.println("length"+values.length());
            password[i]=values.charAt(rndm_method.nextInt(values.length()));
 
        }
        return password;

	}

}