package set23;

public class DuplicatesRemoval {

	static int[] input = { 131, 141, 348 };

	public static void main(String[] args) {
		new Solution().common_digits(input);
	}

	void removeDuplicates() {
		int[] arr = new int[100000000];
		for (int i = 0; i < input.length; i++) {
			if (arr[input[i]] != 1) {
				System.out.println(input[i]);
				arr[input[i]] = 1;
			}
		}
	}
}

class Solution {
	int[] arr = new int[10];
	int count = 0;

	public int[] common_digits(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			seperate(nums[i]);
		}
		int[] output = new int[count];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				output[index++] = i;
				System.out.println(i);
			}
		}
		return output;
	}

	void seperate(int n) {
		while (n > 0) {
			if (arr[n % 10] == 0) {
				count++;
				arr[n % 10] = 1;
			}
			n /= 10;
		}
	}

}
