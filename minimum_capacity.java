// Java implementation of the approach
import java.util.*;

class N
{

// Function to return the minimum capacity required
static int minCapacity(int enter[],
					int exit[], int n)
{

	// To store the minimum capacity
	int minCap = 0;

	// To store the current capacity
	// of the train
	int currCap = 0;

	// For every station
	for (int i = 0; i < n; i++)
	{

		// Add the number of people entering the
		// train and subtract the number of people
		// exiting the train to get the
		// current capacity of the train
		currCap = currCap + enter[i] - exit[i];

		// Update the minimum capacity
		minCap = Math.max(minCap, currCap);
	}
	return minCap;
}

// Driver code
public static void main(String[] args)
{
	int enter[] = { 3, 5, 2, 0 };
	int exit[] = { 0, 2, 4, 4 };
	int n = enter.length;

	System.out.println(minCapacity(enter, exit, n));
}
}

// This code is contributed by naman_d0shi
