package chapter4;

public class Diamond { //다이아몬드 출력 프로그램

	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5-i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 4; i > 0; i--) {
			for(int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
