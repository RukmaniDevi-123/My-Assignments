package week1.day2assignments;

public class FibonacciSeries {
	  public static void main(String[] args) {

		    int n = 8, a = 0, b = 1;
		    System.out.println("Fibonacci Series till " + n + " terms:");

		    for (int i = 1; i <= n; ++i) {
		      System.out.print(a + ", ");

		      int c = a + b;
		      a = b;
		      b = c;
		    }
		  }
		}
