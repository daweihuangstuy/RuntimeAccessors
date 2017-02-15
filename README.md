# RuntimeAccessors

###Our runtime assessment begins with a 2D array created by the "nUnsorted" method.

###This array contains an adjustable number of n-sized arrays arranged in descending order. 

For example, nUnsorted(5, 10) will return a 2D array countaining 5 identical arrays: each one is [4, 3, 2, 1, 0]

###Then, our function access(int[][]) then calculates the amount of time it takes to sort each of those arrays. 

###Once this long is procured, it is divided by the number of times this array was sorted (aka the size of our 2D array).
###The quotient determines the average time it takes for each array to be sorted. 

###For accuracy, we sorted 100,000 arrays in each 2D array, and used the data to generate a graph.


