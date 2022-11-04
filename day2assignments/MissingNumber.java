package week1.day2assignments;

public class MissingNumber {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
for(int i=0; i<=arr.length-1; i++) {
	if(arr[i]!=(i+1)) {
		System.out.println("Missing Number:"+(i+1));
		break;
	}
}

}
}
