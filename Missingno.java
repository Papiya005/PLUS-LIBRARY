import java.util.*;
public class Missingno{
    //another try
    public static int findmiss(int nums[]){
        int actualVal=nums.length*(nums.length+1)/2;
        int currVal=0;
        for(int i=0;i<nums.length;i++){
          currVal=currVal+nums[i];

        }
        int number=actualVal-currVal;
        return number;
    }
    public static int findMissing(int nums[]){
        
        int x_or=nums.length;
     for(int i=0;i<nums.length;i++){
      
      x_or =x_or^i^nums[i];
     }
     return x_or;
    }
    public static void main(String args[] ) {
        int[]nums=new int[3];
        nums[0]=3;
        nums[1]=0;
        nums[2]=1;
        System.out.println(Arrays.toString(nums));
        System.out.println(findMissing(nums));
        System.out.println(findmiss(nums));
    }
}