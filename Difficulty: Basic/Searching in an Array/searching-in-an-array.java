//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume newline character after reading t

        Solution obj =
            new Solution(); // Instantiate the Solution object outside the loop

        while (t-- > 0) {
            int k = sc.nextInt();
            sc.nextLine(); // Consume newline character after reading k

            String line = sc.nextLine();
            Scanner ss = new Scanner(line);
            ArrayList<Integer> arr = new ArrayList<>();
            while (ss.hasNextInt()) {
                arr.add(ss.nextInt());
            }

            int res = obj.search(k, arr);
            System.out.println(res);
        
System.out.println("~");
}

        sc.close(); // Close the scanner
    }
}
// } Driver Code Ends


// User function Template for Java
// class Solution {
//     public int search(int k, ArrayList<Integer> arr) {
//         // code here
//         for(int i=1; i<arr.size; i++){
//             if(arr.get(i)==k){
//                 return -1;
//             }
//         }
//         return -1;
//     }
// }
class Solution {
    public int search(int k, ArrayList<Integer> arr) {
       int v = 0;
        for(int i =0; i<arr.size(); i++) {
            if(k == arr.get(i)) {
                return i+1;
            }
            else {
                  v = -1;
            }
        }
        return v;
    
    }
    
}