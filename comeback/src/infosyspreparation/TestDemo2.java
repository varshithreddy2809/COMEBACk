package infosyspreparation;

public class TestDemo2 {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int left = 0;
		int right = array.length - 1;
		int temp = 0;

		while (left < right) {
			temp = array[left];
			array[left] = array[right];
			array[right] = temp;
			left++;
			right--;
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
