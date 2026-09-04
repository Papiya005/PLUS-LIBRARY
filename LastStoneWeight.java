import java.util.*;
public class LastStoneWeight {
    public static int lastWeight(int stones[]){
        PriorityQueue<Integer>pq=new PriorityQueue<>(( a, b) ->b-a);
        for(int num:stones){
            pq.offer(num);
        }
        
        while(pq.size()>1){
            int x=pq.poll();
            int y=pq.poll();
            

            if(x!=y){
                pq.offer(x-y);
            }
           
        }
       return pq.isEmpty()?0:1;
        

       
        


    }
    public static void main(String args[]){
      int  stones[]={2,7,4,1,8,1};
      System.out.println(Arrays.toString(stones));
      System.out.println(lastWeight(stones));
    }
    

}
