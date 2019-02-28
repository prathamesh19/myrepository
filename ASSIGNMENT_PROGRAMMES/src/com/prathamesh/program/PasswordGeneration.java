package com.prathamesh.program;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class PasswordGeneration {
	public static char[] passGen(int min, int max, String complexity) {
		String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCase = "abcdefghijklmnopqrstuvwxyz";
		String specialCase = "@#$%&*<>?";
		String digitCase = "0123456789";
		final String low = upperCase + lowerCase;
		final String medium = low + digitCase;
		final String high = medium + specialCase;

		if (complexity == "low") {
			System.out.println("\nCOMPLEXITY : LOW");
			complexity = low;
		}

		else if (complexity == "medium") {
			System.out.println("\nCOMPLEXITY : MEDIUM");
			complexity = medium;
		}

		else if (complexity == "high") {
			System.out.println("\nCOMPLEXITY : HIGH");
			complexity = high;
		}

		int i = ThreadLocalRandom.current().nextInt(min, max);
		System.out.println("\nLENGTH OF PASSWORD IS : " + i);
		Random random = new Random();
		char[] password = new char[i];
		for (int j = 0; j < i; j++) {
			password[j] = complexity.charAt(random.nextInt(complexity.length()));
		}
		System.out.println("\nPASSWORD IS: ");
		System.out.println(password);
		return password;

	}

	public static void main(String[] args) {
		passGen(6, 15, "medium");
	}
}
