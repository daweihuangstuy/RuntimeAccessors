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
	//long from access divided by number of arrays for average runTime
	int[][] cs2 = nUnsorted(10000000, 2);
	double george = access(cs2) / 10000000.0;
	System.out.println("Approximate time to sort an array of 2 elements: " + george + " milliseconds.");
	int[][] cs3 = nUnsorted(10000000, 4);
	double david = access(cs3) / 10000000.0;	
	System.out.println("Approximate time to sort an array of 4 elements: " + david + " milliseconds.");
	int[][] cs4 = nUnsorted(10000000, 8);
	double john = access(cs4) / 10000000.0;	
	System.out.println("Approximate time to sort an array of 8 elements: " + john + " milliseconds.");
	int[][] cs5 = nUnsorted(10000000, 16);
	double ringo = access(cs5) / 10000000.0;	
	System.out.println("Approximate time to sort an array of 16 elements: " + ringo + " milliseconds.");
	int[][] cs6 = nUnsorted(10000000, 10);
	double paul = access(cs3) / 10000000.0;	
	System.out.println("Approximate time to sort an array of 10 elements: " + paul + " milliseconds.");
	int[][] cs7 = nUnsorted(100000, 32);
	double elvis = access(cs7) / 100000.0;	
	System.out.println("Approximate time to sort an array of 32 elements: " + elvis + " milliseconds.");
	int[][] cs8 = nUnsorted(100000, 64);
	double bruno = access(cs8) / 100000.0;	
	System.out.println("Approximate time to sort an array of 64 elements: " + bruno + " milliseconds.");
	int[][] cs9 = nUnsorted(100000, 128);
	double lex = access(cs9) / 100000.0;	
	System.out.println("Approximate time to sort an array of 128 elements: " + lex + " milliseconds.");
	int[][] cs10 = nUnsorted(100000, 100);
	double clark = access(cs10) / 100000.0;	
	System.out.println("Approximate time to sort an array of 100 elements: " + clark + " milliseconds.");
	int[][] cs11 = nUnsorted(10000, 1000);
	double bruce = access(cs11) / 10000.0;	
	System.out.println("Approximate time to sort an array of 1000 elements: " + bruce + " milliseconds.");
	int[][] cs12 = nUnsorted(100, 100000);
	double doomsday = access(cs12) / 100.0;	
	System.out.println("Approximate time to sort an array of 100000 elements: " + doomsday + " milliseconds.");
	int[][] cs13 = nUnsorted(1000, 500);
	double doomsday1 = access(cs13) / 1000.0;	
	System.out.println("Approximate time to sort an array of 500 elements: " + doomsday1 + " milliseconds.");
	int[][] cs14 = nUnsorted(1000, 750);
	double doomsday2 = access(cs14) / 1000.0;	
	System.out.println("Approximate time to sort an array of 750 elements: " + doomsday2 + " milliseconds.");
	int[][] cs15 = nUnsorted(100, 50000);
	double doomsday3 = access(cs15) / 100.0;	
	System.out.println("Approximate time to sort an array of 50000 elements: " + doomsday3 + " milliseconds.");
	int[][] cs16 = nUnsorted(100, 25000);
	double doomsday4 = access(cs15) / 100.0;	
	System.out.println("Approximate time to sort an array of 25000 elements: " + doomsday4 + " milliseconds.");
	

       
	
	

    }//end main

}//end class
