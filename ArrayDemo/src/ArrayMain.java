import java.util.Scanner;

public class ArrayMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		// define the array
		int a[] = new int[size];
		
		//input to the array
		for(int i=0; i<a.length;i++) {
			System.out.println("Enter the index value of array: " + i);
			a[i]=sc.nextInt();
		}
		
		//display the array
		for(int i=0; i<a.length;i++) {
			
			System.out.print("[" + a[i] + "]");
			
		}
		
	}

}
