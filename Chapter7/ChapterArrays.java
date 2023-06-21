import java.util.*;
import java.util.Arrays;
import java.util.Collections;
import java.lang.Math;


public class ChapterArrays{

	public static void main(String[] args){
		int[] testArray = {11, 10, 12, 17, 88, 84, 1, 3, 4, 1, 4, 4, 54565, 323, 0};

		//minIndex 
		System.out.println(priceIsRight(testArray, 11));

		//isUnique 
		System.out.println(isUnique(testArray));

		//percentEven 
		System.out.println(percentEven(testArray));

		//minGap
		//System.out.println(minGap(testArray));
		//median 
		//System.out.println(median(testArray));

		//kth-largest
		//System.out.println(kthlargest(testArray, 1));

		//stdev 
		//System.out.println(stdev(testArray));

		//mode
		//System.out.println(mode(testArray));

		//isSorted 
		//System.out.println(isSorted(testArray));

		//countInRange
		//System.out.println(countInRange(testArray, 0, 2));
		
		//range
		//System.out.println(range(testArray));

		//lastIndexOf 
		//System.out.println(lastIndexOf(testArray, 101));

		
		
	}

	//METHODS

	//*************************************************************
	public static int priceIsRight(int[] data, int bid){
		int len = data.length;
		int[] copy = Arrays.copyOf(data, len);
		int minIndex = 0;
		int posCount = 0;
		for(int i = 0; i < len; i++){
			copy[i] -= bid;
			if(copy[i] < copy[minIndex]){
				minIndex = i;
			}
			if(copy[i] > 0){
				posCount++;
			}
		}
		if(posCount < len){
			return copy[3];
		} 
		return -1;
	}	
	
	//*************************************************************
	public static boolean isUnique(int[] data){
		int len = data.length;
		int[] copy = Arrays.copyOf(data, len);
		int[] diff = new int[len - 1];
		
		Arrays.sort(copy);
		
		for(int i = 0; i < len - 1; i++){
			diff[i] = copy[i + 1] - copy[i];
 		}
	
		for(int n: diff){
			if(n == 0){
				return false;
			}
		}
		return true;
		
	}
	
	
	//*************************************************************
	public static double percentEven(int[] data){
		int evenCount = 0;
		int len = data.length;
		if(len == 0){
			return 0;
		}
		
		for(int n: data){
			if(n % 2 == 0){
				evenCount++;
			}
		}
		return (evenCount*100.0)/len;
	}

	//*************************************************************
	public static int minGap(int[] data){
		if(data.length < 2){
			return 0;
		}
		int len = data.length;
		int[] diff = new int[len - 1];
		for(int i = 0; i < len - 1; i++){
			diff[i] = data[i + 1] - data[i];
 		}
		Arrays.sort(diff);
		return diff[0];
	}

	//*************************************************************
	//Odd sized array inputs assumed 
	public static int median(int[] data){
		int len = data.length;
		int[] copy = Arrays.copyOf(data, data.length);
		Arrays.sort(copy);
		return copy[len/2];
	}	

	//*************************************************************
	public static int kthlargest(int[] data, int k){
		if(k < 0 || k >= data.length){
			throw new ArrayIndexOutOfBoundsException();
		}
		int[] copy = Arrays.copyOf(data, data.length);
		Arrays.sort(copy);
		return copy[copy.length - k - 1];
	}

	//*************************************************************
	public static double stdev(int[] data){
		double average = 0.0;

		for(int n: data){
			average += n;
		}
		
		average /= data.length;

		double variance = 0.0;

		for(int n: data){
			variance += Math.pow(n - average, 2);
			variance /= data.length;
		}
		return Math.sqrt(variance);
	}

	//*************************************************************
	public static int mode(int[] data){
		Set<Integer> unique = new TreeSet<>();

		for(int n: data){
			unique.add(n);
		}

		int[] tally = new int[2*unique.size()];

		int tracker = 0;

		for(int n: unique){
			tally[tracker] = n;
			tracker++;
		}

		for(int i = 0; i < unique.size(); i++){
			for(int n: data){
				if(tally[i] == n){
					tally[i + unique.size()] += 1;
				}
			}
		}
		int max = tally[unique.size()];
		int modeIndex = unique.size();

		for(int i = unique.size() + 1; i < 2*unique.size(); i++){
			if(tally[i] > max){
				max = tally[i];
				modeIndex = i;
			}
		}
		return tally[modeIndex - unique.size()];
		
		
	}
	//*************************************************************
	public static boolean isSorted(int[] data){
		if(data.length == 0){
			return true;
		}		
		for(int i = 0; i < data.length - 1; i++){
			if(data[i] > data[i + 1]){
				return false;
			}
		}
		return true;
	}

	//*************************************************************
	public static int countInRange(int[] data, int min, int max){
		int count = 0;

		if(min > max){
			return -1;
		}
		
		for(int n: data){
			if(n >= min && n <= max){
				count++;
			}
		}
		
		return count;
	}

	//*************************************************************
	public static int range(int[] data){
		if(data.length == 0){
			return -1;
		}
		int min = data[0];
		int max = data[0];

		for(int n: data){
			if(n < min){
				min = n;
			}
			if(n > max){
				max = n;
			}
		}
		return max - min + 1;
	}
	
	//*************************************************************
	public static int lastIndexOf(int[] data, int value){
		//Null array 
		if(data.length < 1){
			return -1;
		}
		for(int i = data.length - 1; i > -1; i--){
			if(data[i] == value){
				return i;
			}
		}
		return -1;
	}
}