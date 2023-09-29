package Arrays_Problems;

import java.util.ArrayList;
import java.util.List;

public class LeadersinanArray {


    public static List<Integer> superiorElements(int[] a) {
        List<Integer> arr = new ArrayList<>();

        int n = a.length;
        arr.add(a[n-1]);
        int sp = a[n - 1];

        for (int i = n - 1; i >= 0; i--) {
            if (a[i] > sp) {
                arr.add(a[i]);
                sp = a[i];
            }
        }

        return arr; // Add this line to return the list of superior elements
    }


    public static void main(String[] args) {
        int[] arr = {10, 22, 12, 3, 0, 6};
        List<Integer> leaders = superiorElements(arr);
        for (int leader : leaders) {
            System.out.print(leader + " ");
        }
    }
}
