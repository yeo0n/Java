package chapter4;

public class Gugudan2 { //�������� �ܺ��� ���ϴ� ���� �۰ų� ���� �������� ����ϴ� ���α׷�
	public static void main(String[] args) {
		for(int dan = 2; dan <= 9; dan++) {
			for(int gob = 1; gob <= dan; gob++) {
				System.out.print(dan + "X" + gob + "=" + dan*gob + "\t");
			}
			System.out.println();
		}
	}
}
