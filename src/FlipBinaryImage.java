import java.util.Scanner;

public class FlipBinaryImage {

	public static void main(String[] args) {
		System.out.println("enter rows and cols of a matrix");
		Scanner in =new Scanner(System.in);
		int rows=in.nextInt();
		int cols=in.nextInt();
		
		System.out.println("Enter binary matrix (0 or 1) of  "+rows+"X"+cols+" Matrix");
		int arr[][]=new int[rows][cols];
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				int input=in.nextInt();
			
				if(input==0||input==1) {
					arr[i][j]=input;
					
				}
				else {
					System.out.println("Invalid Input");
					System.exit(-1);
				}
				
			}
		}
		System.out.println("Elements in the array");
		for(int rarray[]:arr) {
			for(int item:rarray)
				System.out.print(item+" ");
			System.out.println();
		}
	
		arr=horizontalFlip(arr,rows,cols);
		System.out.println("Elements in the array after horizontal flip");
	
		for(int rarray[]:arr) {
			for(int item:rarray)
				System.out.print(item+" ");
			System.out.println();
		}
		
		arr=InverseBinaryBits(arr,rows,cols);
		System.out.println("Elements in the array after binary bits inversion");
		
		for(int rarray[]:arr) {
			for(int item:rarray)
				System.out.print(item+" ");
			System.out.println();
		}
	
	}

	private static int[][] InverseBinaryBits(int[][] arr, int rows, int cols) {
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(arr[i][j]==0)
					arr[i][j]=1;
					else
						arr[i][j]=0;
			}
		}
		return arr;
	}

	private static int[][] horizontalFlip(int[][] arr,int rows,int cols) {
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols/2;j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[i][cols-1-j];
				arr[i][cols-1-j]=temp;
			}
		}
		return arr;
	}

}
