package chapter4;

public class Gugudan2 { //구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는 프로그램
	public static void main(String[] args) {
		for(int dan = 2; dan <= 9; dan++) {
			for(int gob = 1; gob <= dan; gob++) {
				System.out.print(dan + "X" + gob + "=" + dan*gob + "\t");
			}
			System.out.println();
		}
	}
}
