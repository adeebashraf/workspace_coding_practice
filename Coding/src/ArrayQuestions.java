import java.util.Arrays;

/**
 * 
 */

/**
 * @author Adeeb
 *
 */
public class ArrayQuestions {

	/**
	 * 
	 */
	public ArrayQuestions() {
		// TODO Auto-generated constructor stub
	}
	
	public static int [] insertElementInArray(int [] array, int e) {
		int i = 0;
		
		for(i = 0; i < array.length && array[i] < e; i++) {
			
		}
		
		int j = array.length - 1;
	
		// Shift remaining elements towards array end.		
		for(; j > i; j--) {
			array[j] = array[j - 1];
		}
		
		if(i != array.length) {
			array[i] = e;
		} else {
			array[i-1] = e;
		}
		
		return array;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//int [] array = new int[] {1, 2, 3, 5, 6, 0};
		//int [] array = new int[] {1, 2, 3, 4, 5, 0};
		int [] array = new int[] {5, 0};
		array = insertElementInArray(array, 6);
		System.out.println(Arrays.toString(array));
	}

}
