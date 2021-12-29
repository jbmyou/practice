public class Test {

	public static void main(String[] args) {

		int i = 2;
		while (i <= 9) {
			int j = 1;
			while (j <= 9) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
				j++;
			}
			System.out.println("10초 뒤에 다음 단이 출력됩니다.");
			try {
				for (int k = 10; k >= 1; k--) {
					System.out.print(k + "\t");
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i = (i < 9) ? i+1 : 2;
			System.out.println();
		}

	}