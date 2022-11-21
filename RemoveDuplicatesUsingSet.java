package week3.day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesUsingSet {
	public static void main(String[] args) {
	
		String text ="We learn java basics as part of java sessions in java week1";
		String[] split=text.split(" ");

		Set <String> set = new HashSet<String>(Arrays.asList(split));
		System.out.println(set);
		
			
			
		
		}
	
	}


	
	
	
	
	
	
	
	

