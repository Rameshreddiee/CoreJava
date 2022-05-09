package com.coreJava;

import java.util.Scanner;

public class demo 
{
	public static void main(String[] args) {

		String name = "RameshReddy";
		for(int i = 0;i<name.length();i++)
		{
			switch (name.toLowerCase().charAt(i)) {
			case 'a':System.out.println("A is Vowel");
				break;
			case 'e':System.out.println("E is Vowel");
			break;
			case 'i':System.out.println("I is Vowel");
			break;
			case 'o':System.out.println("O is Vowel");
			break;
			case 'u':System.out.println("U is Vowel");
			break;

			default: System.out.println(name.toLowerCase().charAt(i)+" is Consonant");
				break;
			}
		}
	}


}
