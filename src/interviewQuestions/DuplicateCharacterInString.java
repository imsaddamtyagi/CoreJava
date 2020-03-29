package interviewQuestions;

import java.util.HashMap;

 class DuplicateCharacterInString
{
	 public static void Husain(String str)
		{
			
			char ch[] = str.toCharArray();
			
			HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
			
			for(char c: ch)
			{
				if(hm.containsKey(c))
				{
					hm.put(c, hm.get(c)+1);
				}
				else
				{
					hm.put(c,1);
				}
			}		
		}

	 public static void main(String[] args) {
		
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String strn = sc.nextLine();*/
		
		String strn = "Mohd Husain Ahmad";
		
		Husain(strn);
	//	sc.close();


	}

}
