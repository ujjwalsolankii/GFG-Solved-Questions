//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());

        while (t-- > 0) {
            String line = read.readLine().trim();
            String[] numsStr = line.split(" ");
            int[] nums = new int[numsStr.length];
            for (int i = 0; i < numsStr.length; i++) {
                nums[i] = Integer.parseInt(numsStr[i]);
            }

            int d = Integer.parseInt(read.readLine().trim());

            Solution ob = new Solution();
            ArrayList<Integer> result = ob.subarraySum(nums, d);
            // Print all elements in the result list
            for (int i : result) {
                System.out.print(i + " ");
            }
            System.out.println(); // Print a new line after the result
            System.out.println("~");
        }
    }
}

// } Driver Code Ends



class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        int sum =0;
        ArrayList<Integer> list = new ArrayList<>();
        int i=0;
        int j=0;
        while(j<arr.length){
            sum = sum + arr[j];
            while(sum>target){
                sum = sum - arr[i];
                i++;
            }
            if(sum == target){
                if(i>j) break;
                list.add(i+1);
                list.add(j+1);
                break;
            }
            j++;
        }
        if(list.isEmpty()){
            list.add(-1);
        } 
        return list;
    }
}
