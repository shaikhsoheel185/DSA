import java.util.ArrayList;
import java.util.List;

public class CombinationSumOne {



    public List<List<Integer>> CombinationSum ( int [] nums , int n) {

        List<List<Integer>> List = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();

        FindCombination( 0 , n , nums , List , ds);

        return List;
    }

    public void FindCombination ( int ind , int target , int [] arr , List<List<Integer>> li , List<Integer> ds ) {

        if ( ind == arr.length) {

            if ( target == 0) {
                li.add( new ArrayList<>(ds));
            }
        }


        if ( arr [ ind ] <= target ) {
            ds.add(arr[ind]);
            FindCombination( ind , target - arr[ ind] , arr, li, ds);
            ds.remove(ds.size()-1);

        }

        FindCombination( ind +1 , target , arr , li , ds);

    }


    public static void main(String[] args) {

        int [] Candidates = { 2, 3, 6, 7 };

        int x  =Candidates.length;



        int  target = 7;
        CombinationSumOne s= new CombinationSumOne();


        List<List<Integer>>  list =s.CombinationSum( Candidates ,   target );




    }
}
