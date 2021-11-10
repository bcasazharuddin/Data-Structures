// ques :Given a random set of numbers, Print them in sorted order.
//Expected Time Complexity: O(N * log N)
//Expected Auxiliary Space: O(1)


import java.io.*;
import java.util.*; 


class randomsort{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt(); 
            int arr[] = new int[n];
            for (int i = 0; i < n; ++i)
            {
                arr[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            int []ans= obj.sortArr(arr, n);
            for(int i=0;i<n;i++)
            {
                System.out.print(ans[i]+" ");
            }
            System.out.println();
        }
        
    }
}// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    int[] sortArr(int[] arr, int n) 
    { 
       
        // code here
         Quicksort(arr,0,(n-1));
           return arr;
    }
        
        
         
        
        void Quicksort(int arr[],int p,int r){
            if(p<r){
                int q = partition(arr,p,r);
                Quicksort(arr,p,(q-1));
                Quicksort(arr,(q+1),r);
                
            }
        }    
            int partition(int[] arr,int p,int r){
            int pivot = arr[r];
            int i = (p-1);
            for(int j=p;j<=(r-1);j++){
                if(arr[j]<=pivot){
                    i++;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp; 
                }
            }
            int temp = arr[i+1];
            arr[i+1] = arr[r];
            arr[r] = temp ;
            return (i+1);
        }
        
        
}
