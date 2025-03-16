package Programs;

import java.util.Scanner;

public class firstUniqueCharacter {
	 public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter a string");
	String s = sc.nextLine();
	
	 
	int count=0;
	
	 for(int i=0;i<s.length();i++) {
		 boolean unique=true;
		 
		 for(int j=0;j<s.length();j++) {
			 if((i != j) && s.charAt(i)==s.charAt(j)) {
				  unique=false;
				  count=1;
				  break;
			 }
		 }
		 if(unique) {
			 System.out.println(s.charAt(i)); ;
			 break;
			 
		 }
	 
	 }
		 if(count==1) {
			 System.out.println("no unique character found");
		 }
	 
	 }
	 }

	
		 


       
		   
		



	


