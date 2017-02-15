/*======================================
  class MergeSortTester

  ALGORITHM:
  <INSERT YOUR DISTILLATION OF ALGO HERE>

  BIG-OH CLASSIFICATION OF ALGORITHM:
  <INSERT YOUR EXECUTION TIME CATEGORIZATION OF MERGESORT HERE>

  Mean execution times for dataset of size n:
  Batch size: <# of times each dataset size was run>
  n=1       time: 
  n=10      time: 
  n=100     time: 
  ...
  n=<huge>  time: 

  ANALYSIS:
  <INSERT YOUR RESULTS ANALYSIS HERE>
  ======================================*/
import java.util.Arrays;
public class MergeSortTester 
{
    //returns backwards int[] array of n integers 
    // ie: genrev(10) = [9, 8, 7, 6, 5, 4, 3, 2, 1, 0];
    public static int[] genrev(int n){
	int[] bob = new int[n];
	for (int i = n - 1; i > 0; i--){
	    bob[n - 1- i] = i;
	}
	return bob;
    }
	
    
    /******************************
     * execution time analysis 
     * Runtime accessed with System.currentTimeMillis() 
     *  YOUR APPARATUS FOR GENERATING EXECUTION 
     *  TIME DATA...>
     ******************************/
    public static void main( String[] args ) 
    {
	// System.out.println(Arrays.toString(genrev(10)));
	long start = System.currentTimeMillis();
	

    }//end main

}//end class
