// BINARY SEARCH IN JAVA ;
import java.util.Arrays;
import java.util.Scanner;

public class program21 {
  public static void main(String[] args) {

    // unsorted array of String
    String arr[] = {"Java", "HTML", "C++", "Python", "CSS"};
    
    // display initial array
    System.out.println("Initial array = " 
                       + Arrays.toString(arr));
    
    // sort the array
    Arrays.sort(arr);
    
    // display array after sorting
    System.out.println("Initial array = " 
                       + Arrays.toString(arr));

                                                            // Scanner class object to read input
    Scanner scan = new Scanner(System.in);
    
                                                                 // read character
    System.out.print("Enter a string to search: ");
    String str = scan.next();
    
                                                                 // search character
    int index = Arrays.binarySearch(arr, str);
    
                                                                  // display result
    if(index != -1)
      System.out.println(str + " found at index = " + index);
    else
      System.out.println(str+" not found.");
    
    // close Scanner
    scan.close();
  }
}