import java.util.*;

public class Chapter10{
	public static void main(String[] args){

		ArrayList<String> test = new ArrayList<>();
		ArrayList<Integer> test1 = new ArrayList<>();

		test.add("Washington");
		test.add("California");
		test.add("Colorado");
		test.add("New York");
		test.add("Maine");
		test.add("Minnesota");
		test.add("Massachusetts");
		test.add("Florida");
		test.add("Arizona");


		test1.add(2);
		test1.add(5);
		test1.add(7);
		test1.add(1);
		test1.add(0);
		test1.add(4);
		test1.add(3);
		test1.add(0);
		test1.add(12);

		System.out.println(test1);
		filterRange(test1, 3, 5);
		System.out.println(test1);
	}


		



//**********************___ArrayList Methods___******************************
//----------------------clump----------------------------------------

	public static void clump(ArrayList<String> data){
		
	}



//----------------------filterRange----------------------------------------

	public static void filterRange(ArrayList<Integer> data, int start, int end){
		for(int i = 0; i < data.size(); i++){
			if(data.get(i) <= end && data.get(i) >= start){
				data.remove(data.get(i));
				i--;
			}
		}
	}


//----------------------removeShorterStrings----------------------------------------
	public static void removeShorterStrings(ArrayList<String> data){
		ArrayList<String> newList = new ArrayList<String>();

		for(int i = 1; i < data.size(); i+= 1){
			if(data.get(i - 1).length() < data.get(i).length()){
				data.remove(i - 1);
			}else{
				data.remove(i);
			}
		} 
	}

//----------------------reverse3----------------------------------------
	public static void reverse3(ArrayList<Integer> data){
		ArrayList<Integer> newList = new ArrayList<>();

		if(data.size() < 3){

		}else{
			for(int i = 2; i < data.size(); i+= 3){
				int temp = data.get(i);
				data.set(i, data.get(i - 2)); 
				data.set(i - 2, temp);
			}
		}
	}

//----------------------markLength4----------------------------------------

	public static void markLength4(ArrayList<String> data){
		 	
		for(int i = 0; i < data.size(); i++){
			if(data.get(i).length() == 4){
				data.add(i, "****");
				i++;
			}
		}

	}
//----------------------stutter----------------------------------------
	public static void stutter(ArrayList<String> data, int k){
		ArrayList<String> newList = new ArrayList<String>();
		for(int i = 0; i < data.size(); i++){
			for(int j = 0; j < k; j++){
				newList.add(data.get(i));
			}
		}

		data.clear();
		data.addAll(newList);
	}



//----------------------removeInRange----------------------------------------
	public static void removeInRange(ArrayList<String> data, String start, String end){
		for(int i = 0; i < data.size(); i++){
			if(data.get(i).toLowerCase().compareTo(end) <= 0 && data.get(i).toLowerCase().compareTo(start) >= 0){
				data.remove(data.get(i));
			}
		}
	}

//----------------------rangeBetweenZeroe----------------------------------------
	public static int rangeBetweenZeroe(ArrayList<Integer> data){
		ArrayList<Integer> indexList = new ArrayList<>();

		for(int i = 0; i < data.size(); i++){
			if(data.get(i) == 0){
				indexList.add(i);
			}
		}
		if(indexList.size() < 2){
			return indexList.size();
		}
		return indexList.get(indexList.size() - 1) - indexList.get(0) + 1;
	}




//----------------------removeZeroe----------------------------------------
	public static void removeZeroe(ArrayList<Integer> data){
		while(data.contains(0)){
			data.remove(Integer.valueOf(0));
		}
	}

//----------------------removeDuplicates----------------------------------------

	public static void removeDuplicates(ArrayList<String> data){
		ArrayList<String> newList = new ArrayList<String>();
		
		
		for(int i = 0; i < data.size(); i++){
			if(!newList.contains(data.get(i))){
				newList.add(data.get(i));
			}
		}	
		data.clear();
		data.addAll(newList);
	}

//----------------------minToFront----------------------------------------

	public static void minToFront(ArrayList<Integer> data){
		if(data.size() == 0){
			throw new NullPointerException("Empty ArrayList passed");
		}
		int min = data.get(0);
		for(int n: data){
			if(n < min){
				min = n;
			}
		}

		data.remove(Integer.valueOf(min));
		data.add(0, min);
	}
//----------------------scaleByK----------------------------------------
	public static void scaleByK(ArrayList<Integer> data){
		ArrayList<Integer> newList = new ArrayList<Integer>();
		for(int i = 0; i < data.size(); i++){
			for(int j = 0; j < data.get(i); j++){
				newList.add(data.get(i));
			}
		}

		data.clear();
		data.addAll(newList);
	}

//----------------------doubleList----------------------------------------

	public static void doubleList(ArrayList<String> data){
		ArrayList<String> newList = new ArrayList<>();

		for(int i = 0; i < data.size(); i++){
			newList.add(data.get(i));
			newList.add(data.get(i));
		}
		data.clear();
		data.addAll(newList);
	}

//----------------------removeEvenLength----------------------------------------
	
	public static void removeEvenLength(ArrayList<String> data){
		for(int i = 0; i < data.size(); i++){
			if(data.get(i).length() % 2 == 0){
				data.remove(i);
			}
		}
	}


//----------------------swapPairs----------------------------------------


	public static void swapPairs(ArrayList<String> data){

		for(int i = 1; i < data.size(); i+= 2){
			String temp = data.get(i);
			data.set(i, data.get(i - 1));
			data.set(i - 1, temp);
		}
	}



//----------------------averageVowels----------------------------------------


	public static double averageVowels(ArrayList<String> data){
		//Empty ArrayList Conditional 
		if(data.size() < 1){
			return 0.0;
		}
		int totalChar = 0;
		double vowels = 0;

		ArrayList<Character> vowelList = new ArrayList<>();
		vowelList.add('a');
		vowelList.add('e');
		vowelList.add('i');
		vowelList.add('o');
		vowelList.add('u');

		for(String s: data){
			String str = s;
			for(int i = 0; i < str.length(); i++){
				if(vowelList.contains(str.charAt(i))){
					vowels++;
				}
				if(str.charAt(i) != ' '){
					totalChar++;
				}
				
			}
		}

		return vowels/totalChar;
	}



}