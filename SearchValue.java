public class SearchValue {
    
    
    public static boolean contains(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true; 
            }
        }
        return false; 
    }

    public static void main(String[] args) {
        int[] arr = {55, 44, 66, 7, 9, 21};
        int target = 7; 
        
    
        if (contains(arr, target)) {
            System.out.println("The array contains the value: " + target);
        } else {
            System.out.println("The array does not contain the value: " + target);
        }
    }
}