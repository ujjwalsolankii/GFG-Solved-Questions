//{ Driver Code Starts
import java.lang.Math;
import java.util.Scanner;

class Convert_To_Five {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println(new Solution().convertfive(N));
            T--;
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


class Solution {
    int convertfive(int num) {
        String str = Integer.toString(num);
        String red = str.replaceAll("0","5");
        num = Integer.parseInt(red);
        return num;
    }
}
