//{ Driver Code Starts
import java.util.*;


// } Driver Code Ends

// User function Template for Java

class Solution {

    public long firstIndex(int arr[]) {
        // Your code goes here
        for(int i=0; i<arr.length; i++){
            if(arr[i]==1){
                return i;
            }
        }
        return -1;
    }
}


//{ Driver Code Starts.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        while (t-- > 0) {
            String input = sc.nextLine();
            String[] parts = input.split(" ");
            int[] arr = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                arr[i] = Integer.parseInt(parts[i]);
            }
            Solution ob = new Solution();
            System.out.println(ob.firstIndex(arr));
        
System.out.println("~");
}
        sc.close();
    }
}
// } Driver Code Ends