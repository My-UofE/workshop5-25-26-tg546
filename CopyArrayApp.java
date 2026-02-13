import java.util.Arrays;
import java.util.ArrayList;

public class CopyArrayApp{
  public static void main(String[] args) {

    /*
    Task 1.1
    int nVals = args.length;
    int[] myVals = new int[nVals];
    for (int i = 0; i < nVals; i++) {
      int item = Integer.parseInt(args[i]);
      //System.out.println(item);
      myVals[i] = item;
    }

    System.out.println("original values: " + Arrays.toString(myVals));


    */
    ArrayList<Integer> normalVals = new ArrayList();
    ArrayList<Integer> uniqueVals = new ArrayList();
    int nVals = args.length;
    for (int i = 0; i < nVals; i++) {
      int item = Integer.parseInt(args[i]);
      if (!uniqueVals.contains(item)){
        uniqueVals.add(item);
      }
      normalVals.add(item);
    }
    System.out.println("original values: " + normalVals);
    System.out.println("unique values: " + uniqueVals);
  }
}