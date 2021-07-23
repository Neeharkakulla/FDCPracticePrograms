import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MorseCodeChecker 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		String morsecode[]= {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",
			 ".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		
		Map<String,String> map=new LinkedHashMap<>();
		
		for(int i=0;i<26;i++)
			map.put(""+(char)(i+97), morsecode[i]);
		
			Map<String,String> inputCodes=new LinkedHashMap<>();
			System.out.println("Enter no. of inputs N");
			int n=in.nextInt();
			in.nextLine();
			for(int i=0;i<n;i++) {
			inputCodes.put(in.nextLine(), in.nextLine());
			}
//			inputCodes.put("gin", "--...-.");
//			inputCodes.put("zen", "--...-.");
//			inputCodes.put("gig", "--...--.");
//			inputCodes.put("msg", "--...--.");
//			
			
			System.out.println("Wrong Input codes count "+getMorseCodeCount(map,inputCodes));
	}
	
	private static int getMorseCodeCount(Map<String, String> map, Map<String, String> inputCodes)
	{
		int count=0;
		for(Map.Entry<String, String> item:inputCodes.entrySet()) {
			
			String conversionString="";
			
			for(int i=0;i<item.getKey().length();i++) 
				conversionString+=map.get(""+item.getKey().charAt(i));
			
			
			if(!conversionString.equalsIgnoreCase(item.getValue()))
				count++;
		}
		return count;
	}
}
