import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MorseCodeCount {
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		String morsecode[]= {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",
			 ".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		
		Map<String,String> map=new LinkedHashMap<>();
		
		for(int i=0;i<26;i++)
			map.put(""+(char)(i+97), morsecode[i]);
		
			ArrayList<String> inputCodes=new ArrayList<>();
			System.out.println("Enter no. of inputs N");
			int n=in.nextInt();
			in.nextLine();
			for(int i=0;i<n;i++) {
				System.out.println("Enter plain text");
				String text=in.nextLine();
				inputCodes.add(text);
			}
			
			
			System.out.println("Different Tranformations Count of Input codes : "+getDifferentTranformationsCount(map,inputCodes));
	}
	
	private static int getDifferentTranformationsCount(Map<String, String> map, ArrayList<String> inputCodes)
	{
		
		Set<String> morsecodeStrings=new HashSet<>();
		
		for(String item:inputCodes) {
			
			String conversionString="";
			
			for(int i=0;i<item.length();i++) 
				conversionString+=map.get(""+item.toLowerCase().charAt(i));
			
			
				morsecodeStrings.add(conversionString);
		
				
			
				
			
		}
		return morsecodeStrings.size();
	}

}
