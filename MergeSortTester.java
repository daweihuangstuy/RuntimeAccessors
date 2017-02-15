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

    // 2D int array containing arrays of unsorted lists
    public static int[][] nUnsorted(int numArr, int n){
	int[][] bob = new int[numArr][n];
	for(int i = 0; i < numArr; i++){
	    bob[i] = genrev(n);
	}
	return bob;
    }
    
    // calculates the average time it takes to sort elements in the array
	public static double access(int[][] arr){
	long start = System.currentTimeMillis();
	for(int i = 0; i < arr.length; i++){
	    MergeSort.sort(arr[i]);
	}
	long end = System.currentTimeMillis();
	return end - start;

	}
    /******************************
     * execution time analysis 
     * Runtime accessed with System.currentTimeMillis() 
     *  YOUR APPARATUS FOR GENERATING EXECUTION 
     *  TIME DATA...>
     ******************************/
    public static void main( String[] args ) 
    {

	//long from access divided by number of arrays for average runTime
	int[][] cs = nUnsorted(10000, 16);
	int[][] cs2 = nUnsorted(100000, 16);
	double tim = access(cs) / 10000.0;
	double george = access(cs2) / 100000.0;
	System.out.println("Approximate time to sort an array of 16 elements: " + tim + " milliseconds.");
	System.out.println("Approximate time to sort an array of 16 elements: " + george + " milliseconds.");
	

       
	
	

    }//end main

}//end class
