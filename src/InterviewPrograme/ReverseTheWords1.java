package InterviewPrograme;

public class ReverseTheWords1 {

	public static void main(String[] args) {
		
		String s="hello i love java ";
		String temp="";
		
		for(int i=s.length()-1;i>=0;i--){
			
		temp =temp+s.charAt(i);	
			
		}
		
		System.out.println(temp);
		
		String[]words=temp.split("");
		
		System.out.println(words.length);
		
	}

}