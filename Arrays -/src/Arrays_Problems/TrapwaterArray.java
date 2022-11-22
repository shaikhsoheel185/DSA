package Arrays_Problems;

public class TrapwaterArray {

    public static int TrapWater(int[] height ) {
        int area=0;
        int n=height.length;

        int [] Maxl=new  int [n];
        int [] MaxR=new  int [n];

        Maxl[0]= height[0];

        for (int i=1; i< n; i++ ) {
           Maxl[i] =Math.max(i-1, height[i]);
        }

        MaxR[n-1]=height[n-1];

        for (int i=n-2; i>=0; i-- ) {

            MaxR[i] =Math.max(i+1,height[i]);
        }

        for (int i=0; i<n; i++) {
            area+= Math.min( (int) Maxl[i],MaxR[i]) -height[i];
        }

        return area;
    }



    public static void main(String[] args) {

        int [] height= {0,1,0,2,1,0,1,3,2,1,2,1};
        int a =TrappingWaterArray.TrapWater(height);
        System.out.print(a);
    }
}
