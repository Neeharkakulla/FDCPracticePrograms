import java.util.Arrays;
import java.util.Scanner;

public class EvenDigitsChecker
{
	
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter size of array");
		
		int size=in.nextInt();
		int arr[]=new int[size];
		
		System.out.println("Enter the "+size+" elements in array");
		
		for(int i=0;i<size;i++) 
			arr[i]=in.nextInt();
		
		System.out.println("Elements in array are: "+Arrays.toString(arr));
		
		
		
		
		int count=0;
		
		for(int item:arr) 
			if(String.valueOf(item).length()%2==0)
				count++;
		
		System.out.println("Elements having even number of digits are "+count);
	}
}
