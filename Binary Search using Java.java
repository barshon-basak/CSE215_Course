
package javaapplication20;

//import java.util.Scanner;

public class JavaApplication20 {
    
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,9,11,19,145};
        
        int ans = binarySearch(arr,15);
        
        System.out.println(ans+"");
        
    }

  public static int binarySearch(int[] list, int key) {
  int low = 0;
  int high = list.length - 1;

  while (high >= low) {
    int mid = (low + high) / 2;
    if (key < list[mid])
      high = mid - 1;
    else if (key == list[mid])
      return mid;
    else
      low = mid + 1;
  }

  return -1;
}

    }
    
