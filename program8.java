class stringexample2
{
	public static void main(String args[])
	{
		String str1="JaVa Programming";
		String str2="JaVa programming";
		System.out.println(str1);
		
		System.out.println("\n\n----------\n\n");
		
		//char res=str1.charAt(5);
		
		//int res=str1.indexOf('P',6);//if after 6 P is not present simply it will print -1;

		//String res=str1.substring(6);
 
		//boolean res=str1.equals(str2);//if we want to remove case sensivity then we will add equalsIgnoreCase();

		boolean res=str1.equalsIgnoreCase(str2);

		//String res=str1.concat(str2);
		System.out.println(res);
		
	}
}