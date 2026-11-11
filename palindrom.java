
import java.util.*;

public class palindrom{
	public static void main(String args[]){
			Scanner input = new Scanner(System.in);
			char stack[] = new char[100];
			int top=-1;
			
			System.out.print("Enter a word: ");
			String word=input.nextLine();
			
			for(int i=0;i<word.length();i++){
				top++;
				stack[top]=word.charAt(i);
			}
			String reverse="";
			while(top >= 0) {
				reverse = reverse + stack[top];
				top--;
			}
			
			if(word.equalsIgnoreCase(reverse)){
				System.out.println("Palindrome");
			} else{
				System.out.println("Not Palindrome");
			}
			input.close();
	}
}
