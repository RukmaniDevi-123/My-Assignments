package week3.day1assignment;

public class UpperToLowerCase {
	public static void main(String[] args) {
		String test="changeme";
		
		char[] charArray = test.toCharArray();
		for(int i=0;i<charArray.length;i++)
			
		{
			if(i%2!=0)
			{
				System.out.print(" "+charArray[i]);
				System.out.println(test.toUpperCase());
			}
			
		}

	}

}