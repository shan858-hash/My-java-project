import java.util.*;

public class LinearSearchExample{
	public static int linearSearch(int[] arr,int key){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==key)
				return i;
		}
		return -1;
	}
	

	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
	
		int arr[]={5,17,26,25,35,49,58,84,96};
		System.out.print("Enter the serching number:");
		int target=input.nextInt();
		int result=linearSearch( arr, target);
			if(result==-1){
				System.out.println("Element is not found");
			}else{
				System.out.println("Element found at index:"+result);
			}
	}
	
}