//Question 1: find the minimum and maximum element of array. 
import java.util.*;
class Pair{
     int minelement;
     int maxelement;
     public Pair(int minelement ,int maxelement){
         this.minelement = minelement;
         this.maxelement = maxelement;
         
       }
    
}

class MinMax{

  public static void main(String[] args){
  
     
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
        
        Compute obj = new Compute();
        
        Pair number = obj.getMinMax(arr,n);
        System.out.println("Minimum Element : "+number.minelement);
        System.out.println("Maximum Element : "+number.maxelement);
  
 }
 }
 
 class Compute{
 
  static Pair getMinMax(int arr[],int n){
  
  
      int max = 0;
        int min = 0;
        for(int i=1;i<n;i++){
            
            if(arr[i]<=arr[min]){
                min = i;
            }
            if(arr[i]>=arr[max]){
                max = i;
            }
        }
    return (new Pair(arr[min],arr[max])); 
    }
  
}   
  
  
               
