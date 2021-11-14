//ques: Given an array arr[] and an integer K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.

//Expected Time Complexity: O(n)
//Expected Auxiliary Space: O(1)




// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

/*import java.io.*;
import java.util.*;
class quickselect{
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    
		    int arr[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    
		    int k=sc.nextInt();
		    Solution ob = new Solution();
		    out.println(ob.kthSmallest(arr, 0, n-1, k-1));
		}
		out.flush();
	}
}
// } Driver Code Ends


//User function Template for Java

//User function Template for Java

class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
       //Your code here
        int p = partition(arr,l,r);
        if(k  > p){
            return kthSmallest(arr,p+1, r, k);
        }
        else if(k< p){
            return kthSmallest(arr,l,p-1, k);
        }
        else{
            return arr[p];
        }
    } 
    
    public static int partition(int[] arr,int l,int r){
            int pivot = arr[r];
            int i = (l-1);
            for(int j=l;j<=(r-1);j++){
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
}*/

// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    
		    int arr[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    
		    int k=sc.nextInt();
		    Solution ob = new Solution();
		    out.println(ob.kthSmallest(arr, 0, n-1, k));
		}
		out.flush();
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
       //Your code here
       /*while(l<=r){
       int p = partition(arr,l,r);
        /*int count = p-l+1;
        if(k  > count){
            return kthSmallest(arr,p+1, r, k-count);
        }
        else if(k< count){
            return kthSmallest(arr,l,p-1, k);
        }
        else{
            return arr[p];
        }*/
      /*  if(p-1 == k-1){
            return arr[p-1];
            
        }
        else if(p-1<k-1){
            l = p+1;
        }
        else{
            r = p-1;
        }
    }
    return -1;
    
        
}    **/
    
    
       // Arrays.sort(arr);
      //  return arr[k-1];
      
      // int n=arr.length;
       
        while(l<=r)
        {
            int sIndex=partition(arr,l,r);
            if(sIndex+1==k)
            return arr[sIndex];
            else if(sIndex+1<k)
            {
                 l=sIndex+1;
            }else
            {
                r=sIndex-1;
            }
        }
        
        //return Integer.MIN_VALUE;
        return -1;
    } 
    public static int partition(int[] arr,int l,int r){
            Random rand=new Random(0);
           int pivotIndex=rand.nextInt(r-l+1)+l;
            int pivot = arr[pivotIndex];
             int temp=arr[r];
             arr[r]=arr[pivotIndex];
             arr[pivotIndex]=temp;
            int i = (l-1);
            for(int j=l;j<=(r-1);j++){
                if(arr[j]<=pivot){
                    i++;
                     temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp; 
                }
            }
             temp = arr[i+1];
            arr[i+1] = arr[r];
            arr[r] = temp ;
            return (i+1);
        }
    /*public static int getPivot(int[] arr, int l, int r)
    {
        Random rand=new Random(0);
        int pivotIndex=rand.nextInt(r-l+1)+l;
        
        int pivotValue=arr[pivotIndex];
        
        int temp=arr[r];
        arr[r]=arr[pivotIndex];
        arr[pivotIndex]=temp;
        
        int lesserTail=l;
        
        for(int i=l;i<r;i++)
        {
            if(arr[i]<pivotValue)
            {
                int temp1=arr[lesserTail];
                arr[lesserTail]=arr[i];
                arr[i]=temp1;
                lesserTail++;
            }
        }
        
        int temp2=arr[r];
        arr[r]=arr[lesserTail];
        arr[lesserTail]=temp2;
        
        return lesserTail;
    }*/

}

