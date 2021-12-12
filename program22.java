import java.util.Arrays;
// Sort using sort function;

public class program22 {
  
  public static void main(String[] args) {

    int arr[] = {50, 25, 30, 55, 15};
    
    System.out.println("Before Sorting: " + Arrays.toString(arr));
    
    Arrays.sort(arr);

    System.out.println("After Sorting: " + Arrays.toString(arr));
  }
}