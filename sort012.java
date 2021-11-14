//question : Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.               

// { Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function template for Java

class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
       // Arrays.sort(a);
       int l = 0, r =(n-1),k=0;
       while(k<=r){
           if(a[k] == 0){
               int temp = a[l];
               a[l] = a[k];
               a[k] = temp;
               k++;
               l++;
           }
           else if(a[k] == 1){
                 k++;
           }
           else{
               int temp = a[r];
               a[r] =a[k];
               a[k] = temp;
               r--;
               
           }
       }
    }
}

// { Driver Code Starts.

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob=new Solution();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}

  // } Driver Code Ends
