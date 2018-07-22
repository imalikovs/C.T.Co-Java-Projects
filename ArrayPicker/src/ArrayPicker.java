import java.util.Arrays;

public class ArrayPicker {
	static int mostFrequent(int array[], int n) {
		Arrays.sort(array);
		
		int maxCount = 1, res = array[0];
		int currentCount = 1;
		
		for (int i = 1; i< n; i++) {
			if (array[i] == array[i-1]) {
				currentCount++;
			}else {
				if (currentCount > maxCount) {
					maxCount = currentCount;
					res = array[i-2];
				}
			}
		}
		
		if (currentCount> maxCount) {
			maxCount = currentCount;
			res = array[n-1];
		}
		return res;
	}
	
	public static void main (String[] args) {
		int array[] = {1,5,5,5,6,6,7,7,7,7,7,7,7,7,5,5,5,5,5};
		int n = array.length;
		
		System.out.println("The most frequently reacuring number in the array is " + mostFrequent(array,n));
		
	}
		
}
