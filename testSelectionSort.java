/*
 * testSelectionSort.java
 *
* To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
public class testSelectionSort {
@Test
public void test() {
testPositive();
testNegative();
testMixed();
testDuplicates();
}
    public testSelectionSort() {
    }



    public testSelectionSort() {
    }
  
    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;

        SelectionSort temp1 = new SelectionSort();
        arr = temp1.basicSelectionSort(arr);
        assertEquals("Wrong!!", Sortedarr, arr);
        /** add tests to check for this unit test **/
    }

    public void testNegative(){
    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -8;
        Sortedarr[3] = -7;
        Sortedarr[4] = -2;


        SelectionSort temp1 = new SelectionSort();
        int sorted[] = temp1.basicSelectionSort(arr);
        assertEquals("Wrong!!", Sortedarr, sorted);
    }
 public void testDuplicates(){
    	int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 8;
        arr[2] = 2;
        arr[3] = 7;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 2;
        Sortedarr[2] = 8;
        Sortedarr[3] = 8;
        Sortedarr[4] = 9;
  }

  public void testMixed(){
    	int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = 10;
        arr[4] = 0;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -9;
        Sortedarr[1] = -7;
        Sortedarr[2] = 0;
        Sortedarr[3] = 8;
        Sortedarr[4] = 10;

        SelectionSort temp1 = new SelectionSort();
        int[] sorted = temp1.basicSelectionSort(arr);
        assertEquals("Wrong!!", Sortedarr, sorted);
        /** Test data contains with both positive, negative and zeros **/
    }
}
