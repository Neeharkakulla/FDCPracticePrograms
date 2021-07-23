import java.util.Arrays;
import java.util.Scanner;

public class PlantingFlowers {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
System.out.println("Enter size of array");
		
		int size=in.nextInt();
		int arr[]=new int[size];
		
		System.out.println("Enter the "+size+" elements in array");
		
		for(int i=0;i<size;i++) {
			int input=in.nextInt();
			
			if(input==1&&isFlowerPlotable(arr, i, size)) 
				arr[i]=input;
			
			else if(input==0)
				arr[i]=input;
			
			else
			{
				System.out.println("Unable to plot adjacent flower");
				System.exit(-1);
			}
			
		}
		
		System.out.println("Elements in array are:"+Arrays.toString(arr));
		
		
		
		System.out.println("\nEnter position to plot a flower");
		int n=in.nextInt();
		
		boolean isFlowerPlotable=isFlowerPlotable(arr,n,size);
		System.out.println(isFlowerPlotable);
		arr[n]=1;
		
	System.out.println("New Elements in array are:"+Arrays.toString(arr));
		
		
	}

	private static boolean isFlowerPlotable(int arr[] ,int n,int size) {
		
		return (n+1>=size)?
				(arr[n-1]==0&&arr[n]==0)?true:false
				
				:(n==0||(n+1<size&&n-1>=0&&(arr[n-1]==0&&arr[n+1]==0&&arr[n]==0)))?true:false;
		
	}

}
