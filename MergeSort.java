//Karina Ionkina, Dawei Huang, Shaikat Islam
//APCS2 Pd05
//HW06 -- Step 1: Split, Step 2: ?, Step 3: Sorted!
//2016-02-12

/*======================================
  class MergeSort
  Implements mergesort on array of ints.

  Summary of Algorithm: 
  Array is recursively divided into halves.
  The halves are then merged through a recursive
  method comparing the first element of 
  the two arrays.
  ==============awei========================*/
public class MergeSort {

   /******************************************************
     * int[] merge(int[],int[]) 
     * Merges two input arrays
     * Precond:  Input arrays are sorted in ascending order
     * Postcond: Input arrays unchanged, and 
     * output array sorted in ascending order.
     ******************************************************/
    private static int[] merge( int[] a, int[] b ) {
	// array to be returned 
    int[] Sorted = new int[a.length + b.length];

    //indicies of a, b, and Sorted 
    int ay = 0;
    int by = 0;
    int ind = 0;
    while(ind < Sorted.length){
	//System.out.println("AY = " + ay + "\n BY = " + by + "\n IND = " + ind);
        if ( ay >= a.length){
	    Sorted[ind] = b[by];
	    by += 1;
	    ind += 1;
	}
	else if(by >= b.length){
	    Sorted[ind] = a[ay];
	    ay += 1;
	    ind += 1;
	  
	}

	else if( a[ay] < b[by]){
	    Sorted[ind]= a[ay];
	    ay += 1;
	    ind += 1;
	  
	}
	
	else if( b[by] < a[ay]) {
	    Sorted[ind] = b[by];
	    by += 1;
	    ind += 1;
	}
	
	else {
	    Sorted[ind] = a[ay];
	    Sorted[ind + 1] = b[by];
	    ay +=1;
	    by +=1;
	    ind += 2;
	}

    }
	return Sorted;
    }//end merge()


    /******************************************************
     * int[] sort(int[]) 
     * Sorts input array using mergesort algorithm
     * Returns sorted version of input array (ascending)
     ******************************************************/
      public static void sort( int[] arr ) 
    {  int[] sorted;
	arr = MS(split1(arr), split2(arr));
	printArray(arr);
    }//end sort() 

    //returns first half of split array
    public static int[] split1(int[] arr){
	int middle = arr.length / 2;
	int[] a = new int[middle];
	
	for (int i = 0; i< middle; i++){
	    a[i] = arr[i];
	}
	return a;
    }
    //returns second half of split array
    public static int[] split2(int[] arr){
	int middle = arr.length / 2;
	int[]b = new int[arr.length - middle];
	for (int i = 0; i < b.length ; i++){
	    b[i] = arr[middle + i ];
	}
	return b;
    }

    //-------------------HELPERS-------------------------
    //tester function for exploring how arrays are passed
    //usage: print array, mess(array), print array. Whaddayasee?
    public static void mess( int[] a ) {
	for( int i = 0 ; i<a.length; i++ )
	    a[i] = 0;
    }

    //helper method for displaying an array
    public static void printArray( int[] a ) {
	String retStr = "[";
	for( int i : a )
	    retStr +=  i + ",";
	System.out.println(retStr.substring(0, retStr.length() -1) + "]");
    }


    
    //recursice helper function splits and merges array until it is sorted

        private static int[] MS(int[] left, int[] right){
	    if(left.length == 1 && right.length == 1){
	    return merge(left, right);
	}
	    else if (left.length == 1){
		return merge(left, MS(split1(right), split2(right)));
	    }
	    else if (right.length == 1){
		return merge(MS(split1(left), split2(left)), right);
	    }
	else {
	    return merge(MS(split1(left), split2(left)), MS(split1(right), split2(right)));
	}
       
    }

    //main method for testing
    public static void main( String [] args ) {
	int[] arr0 = {0};
	int[] arr1 = {1};
	int[] arr2 = {1,2};
	int[] arr3 = {3,4};
	int[] arr4 = {1,2,3,4};
	int[] arr5 = {4,3,2,1};
	int[] arr6 = {9,42,17,63,0,512,23};
	int[] arr7 = {9,42,17,63,0,9,512,23,9};

	System.out.println("\nTesting mess-with-array method...");
	printArray( arr3 );
	mess(arr3);
	printArray( arr3 );

	System.out.println("\nMerging arr1 and arr0: ");
	printArray( merge(arr1,arr0) );
	
	int[] clam = {0, 1, 2, 3, 4, 5, 0, 4, 5, 6};
	int[] shell = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	sort(clam);
	sort(shell);
	
	System.out.println("\nMerging arr4 and arr6: ");
	printArray( merge(arr4,arr6) );

	System.out.println("\nSorting arr4-7...");
	sort( arr4 ) ;
        sort( arr5 ) ;
        sort( arr6 ) ;
	sort( arr7 ) ;
	
	int[] rick = {1, 4, 24, 5, 6, 654, 78, 9};
	sort(rick);

	
    }//end main()

}//end class MergeSort

