//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(
                    token)); // Use Integer.parseInt to parse int values
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            Solution obj = new Solution();

            // calling equilibriumPoint() function
            System.out.println(obj.findEquilibrium(arr));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
        // int i = 0;
        // int j = arr.length-1;
        // int sum1 = arr[0];
        // int sum2 = arr[arr.length-1];
        // while(i<=j){
        //     if(sum1>sum2){
        //         j--;
        //         sum2 += arr[j];
        //     }else if(sum1<sum2){
        //         i++;
        //         sum1 += arr[i];
        //     } else{
        //         if(i==j){
        //             return i;
        //         }else{
        //             i++; j++;
        //         }
        //     }
        // }
        // return -1;
         int lsum = 0, rsum = Arrays.stream(arr).sum()-arr[0];
        for(int i = 1; i < arr.length; i++){
            lsum += arr[i-1];
            rsum -= arr[i];
            if(lsum == rsum)
                return i;
        }
        return -1;
    }
}
