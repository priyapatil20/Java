
public class FormattingProg {

	public static void main(String[] args) {
		
//		printf is used for formatting output
//		for string value => %s is used
//		for integer value => %d is used	
//		\n is used for new line
		
		String s = "JAVA";
		System.out.printf("%s \n",s);       //%s will print string value
		
		String s1 = "JAVA";             
		System.out.printf("%10s \n",s1);    //%10s will print string value making total character count 10. so add spaces before JAVA 
		
		String s2 = "JAVA";
		System.out.printf("%-10s \n",s2);   //%-10s will print string value making total character count 10. so add spaces after JAVA

		int x = 45;
		System.out.printf("%d \n" ,x);      //%d will print integer 45
		
		int x1 = 45;
		System.out.printf("%3d \n",x1);     //%3d will print 3 digit values as 45 is of two digit so it will include space on left side
		
		int x2 = 45;
		System.out.printf("%03d \n",x2);    //%03d will print 0 before given number 45 and will print 3 digits as 3d is given  
		
	}

}
