package set1;

public class WeightageOfElement {
	public static void main(String[] args) {
		new WeightageOfElement().findWeightage();
	}

	int[] arr = { 10, 36, 54, 89, 12 };

	void findWeightage() {
		Element[] output = new Element[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int sqNumber = 0;
			int weightage = 0;
			for (int j = 0; sqNumber < arr[i]; j++) {
				sqNumber = j * j;
				if (sqNumber == arr[i]) {
					weightage += 5;
					break;
				}
			}
			if (arr[i] % 4 == 0 && arr[i] % 6 == 0) {
				weightage += 4;
			}
			if (arr[i] % 2 == 0) {
				weightage += 3;
			}
			output[i] = new Element(arr[i], weightage);
		}

		for (int i = 0; i < output.length; i++) {
			for (int j = i + 1; j < output.length; j++) {
				if (output[i].weightage < output[j].weightage) {
					Element temp = output[i];
					output[i] = output[j];
					output[j] = temp;
				}
			}
			System.out.print("<" + output[i].element + "," + output[i].weightage + ">");
		}

	}

	class Element {
		public int element;
		public int weightage;

		public Element(int element, int weightage) {
			this.element = element;
			this.weightage = weightage;
		}
	}
}
