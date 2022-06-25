package chapter4;

public class Gugudan { //구구단 짝수 단만 출력

	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) { //곱
			for(int j = 2; j<=9; j++) { //단
				if((j % 2) != 0) { 
					continue;
				}
				System.out.print(j + "X" + i + "=" + j*i + "\t");
			}
			System.out.println();
		}

	}

}
