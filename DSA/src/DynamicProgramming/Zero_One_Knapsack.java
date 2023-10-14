package DynamicProgramming;

public class Zero_One_Knapsack {


    public  static  int maxRob( int index , int [] val , int [] wt , int weight) {

        if ( index == 0 &&  wt[index] <=weight) return  val[index];
        if ( index < 0) return Integer.MIN_VALUE;
        int NoTake = maxRob(index-1 , val , wt , weight);

        int Take = 0;
        if (  wt[index] <= weight){
            Take = val[index] + maxRob(index-1 , val , wt , weight-wt[index]);
        }

        return Math.max(Take , NoTake);
    }


    public static void main(String[] args) {


        int [] wt =  { 1,2,4,5};
        int [] val = {5,4,8,6 };

        int weight = 5;
        int ans =maxRob( wt.length-1 ,val , wt , weight);

        System.out.println(ans);
    }
}
