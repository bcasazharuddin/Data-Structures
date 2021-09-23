//find the peak element
import java.util.*;
class Peak
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public static int peakElement(int[] arr,int n)
    {
       int max = 0;    
       for(int i = 1;i<n;i++){
           if(arr[i] > arr[max]){
               max = i;
           }
       }
      return arr[max];
    }
    public static void main(String []args){
        
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
        
        
        System.out.println("peak element :"+peakElement(arr,n));
        
        
        
        
    }
}
