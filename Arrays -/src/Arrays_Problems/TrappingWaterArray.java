package Arrays_Problems;

public class TrappingWaterArray {

    public static int TrapWater(int []height) {
       int area=0;
       int n= height.length-1;
       for (int i=1; i< n ; i++) {
           int maxL=0; int maxR=0;

           for (int j=0; j<=i; j++) {
               maxL=Math.max (maxL,height[j]);         // for the Left MAX;
           } for (int j=i+1; j<n; j++){
               maxR=Math.max(maxR,height[j]);          // fot the right MAX;
           }

           area+=Math.min(maxL,maxR)-height[i];
       }


        return area;
    }

    public static void main(String[] args) {
        int[] height ={0,1,0,2,1,0,1,3,2,1,2,1};
        int a = TrappingWaterArray.TrapWater(height);
        System.out.print(a);
    }
}
