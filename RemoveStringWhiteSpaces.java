package interv;


public class RemoveStringWhiteSpaces {

	public static void main(String args[])
	{
		
		String mytext = "hello     there            jshiho                                 bjhi ";
		
		String mytext1 = mytext.trim().replaceAll("[ ]+", " ");
	
		System.out.println("Text with multiple white spaces : \n " + mytext);
		System.out.println("Text with single spaces : \n" +mytext1);
	}
	}


Output :

Text with multiple white spaces : 
 hello     there            jshiho                                 bjhi 
Text with single spaces : 
hello there jshiho bjhi
