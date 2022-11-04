package week1.day2assignments;

public class Palindrome {

	public static void main(String[] args) {
		int num=34343;
		int rem,sum=0,temp;
		 temp=num;
			
		while(num>0)
		{
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
			
		}
		if(temp==sum)
		{
			System.out.println("the number is palindrome");
		}
		else
		{
			System.out.println("the number is not palindrome");
			
			
		}

	}

}
