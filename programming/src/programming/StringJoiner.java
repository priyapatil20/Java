package programming;

import java.util.Scanner;

public class StringJoiner {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
        System.out.println("Enter string1 : ");
		String str1 = s.next();			
		
        System.out.println("Enter string2 : ");
		String str2 = s.next();	
		
		System.out.println("result after concatenating string1 and string2 is :"+JoinStrings(str1 ,str2));

	}

	private static String JoinStrings(String str1, String str2) {
		// TODO Auto-generated method stub
		return (str1 +" "+str2);
	}

}
