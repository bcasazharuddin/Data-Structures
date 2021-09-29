/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class Reversearray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         System.out.print("Enter the number of test case:");
        int t =sc.nextInt();
        for(int j=0;j<t;j++){
         System.out.print("Enter the size of array :");
          int n=sc.nextInt();
          int arr[]=new int[n];
           System.out.print("Enter the element of array :");
         for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
         System.out.print("reverse array :");
         for(int i=n-1;i>-1;i--){ //main point 
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
      }
     
    }
}   


/*class Reversearray{
    
    public static int[]  reverse(int arr[],int n){
         
         int temp[] = new int[n];
         int k = 0;
         
        for(int i= (n-1); i>=0 ;i--){
          
           temp[k] = arr[i];
           k++;
        }
      return temp;    
     }
	public static void main (String[] args) {
	     System.out.print("Enter the size of array :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The size of array :"+n);
        int arr[] = new int[n];
        for(int i = 0 ;i<n;i++){
            System.out.print("please the enter the element of array :");
            arr[i] = sc.nextInt();
              
            
        }
        System.out.println("Print Array :");
        for(int val : arr){
            System.out.println(val+",");
        }
         
	     arr =    reverse(arr,n);
	      
	     
        System.out.println("Print Reverse Array :");
        for(int val : arr){
            System.out.println(val+",");
        }
		//code
	}
}
*/
