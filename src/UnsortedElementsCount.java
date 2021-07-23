import java.util.Arrays;
import java.util.Scanner;

public class UnsortedElementsCount {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter size of array");
		
		int size=in.nextInt();
		int arr[]=new int[size];
		
		System.out.println("Enter the "+size+" elements in array");
		
		for(int i=0;i<size;i++) 
			arr[i]=in.nextInt();
		
		int darray[]=Arrays.copyOf(arr, size);
		
		Arrays.sort(darray);
		
		int count=0;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(darray));
		for(int i=0;i<size;i++) {
			if(arr[i]!=darray[i])
				count++;
		}
		System.out.println(count);
	}

}
