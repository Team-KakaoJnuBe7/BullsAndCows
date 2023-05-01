
public class CreatRandomNumber {
	public static int[] random() {
		
		int[] numbers = new int[4];
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = (int)(Math.random() * 9 + 1);
			for(int j = 0; j < i; j++) {
				if(numbers[j] == numbers[i])
					i--;
			}
		}
		return numbers;
	}
}
