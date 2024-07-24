// Trapping water

public class Trapping_Water {
  public static int TrappingWater(int height[]){
     int n =height.length;

     // leftmax boundary
     int leftMax[]=new int[n];
     leftMax[0]=height[0];
     for(int i=1;i<n;i++){
        leftMax[i]=Math.max(height[i], leftMax[i-1]);
     }

     // rightMax Boundary
     int rightmax[]=new int[n];
     rightmax[n-1]=height[n-1];
     for(int i=n-2;i>=0;i--){
        rightmax[i]=Math.max(height[i], rightmax[i+1]);
     }

     int trappedWater=0;
     for(int i=0;i<n;i++){
        int waterLevel=Math.min(leftMax[i],rightmax[i]);
        trappedWater+=waterLevel-height[i];
     }
     return trappedWater;
  }
       
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println(TrappingWater(height));
        
    }
}
