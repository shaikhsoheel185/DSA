/*import java.util.ArrayList;
import java.util.List;

public class PrintAllSubSequence {


    public void print ( int index ,List  ,int[] arr, int n ){

        if( index == n) {
            for ( int i = 0; i< List.size(); i++) {
                System.out.print(List.get(i));
            }
            return;
        }

        List.add(arr[index]);

        print( index+1 ,  List , arr , n);
        List.remove(arr[index]);
        print( index+1 ,  List , arr ,n);


    }

    public static void main(String[] args) {

        int [] arr={ 1,2,3};

        List<List<Integer>> ListOfList = new ArrayList<List<Integer>>();
        List<Integer> List= new ArrayList<>();
        int n =3 ;

        PrintAllSubSequence p= new PrintAllSubSequence();

        p.print( 0 ,  List , arr , n);





    }


}*/
