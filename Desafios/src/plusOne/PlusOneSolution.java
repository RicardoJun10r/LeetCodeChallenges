package plusOne;

public class PlusOneSolution {

	public static void main(String[] args) {
		int[] digits = { 8, 9 };
		int[] resultado = plusOne(digits);
		for (int i : resultado) {
			System.out.print(i + " ");
		}
	}

	public static int[] plusOne(int[] digits) {
		int size = digits.length;

		int cauda = size - 1;

		for (int i = cauda; i >= 0; i--) {
			int valor = digits[i] + 1;
			if (valor > 9) {
				digits[i] = 0;
			} else {
				digits[i] = valor;
				return digits;
			}
		}
		int[] tmp = new int[size + 1];
		tmp[0] = 1;
		for (int j = cauda; j >= 0; j--) {
			tmp[j + 1] = digits[j];
		}
		digits = tmp;
		return digits;
	}

}
