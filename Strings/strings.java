package com.ltts.strings;
import java.util.*;
public class StringCompNew {

	public static void main(String[] args) {
		String firstName;
		
		String firstName1;
		
		Scanner in=new Scanner(System.in);
		firstName=in.nextLine();
		
		firstName1=in.nextLine();
		String[] words=firstName.split(" ");
		String[] words1=firstName1.split(" ");
		if(words[1].equalsIgnoreCase(words1[1])) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		 
	}

}