import java.util.*;
public class Missingno{
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
    }
}