interface Maths {
	public void show();

	public void add(int a, int b); // �p�� a+b

	public void sub(int a, int b); // �p�� a-b

	public void mul(int a, int b); // �p�� a*b

	public void div(int a, int b); // �p�� a/b
}

class Computes implements Maths {
	public int ans;

	public void add(int a, int b) {
		ans = a + b;
	}

	public void sub(int a, int b) {
		ans = a - b;
	}

	public void mul(int a, int b) {
		ans = a * b;
	}

	public void div(int a, int b) {
		ans = a / b;
	}

	public void show() {
		System.out.println("ans=" + ans);
	}
}

public class Class05 {
	public static void main(String args[]) {
		Computes cmp = new Computes();
		cmp.mul(3, 5); // �p�� 3*5
		cmp.show(); // ����|�^��"ans=15"�r��
	}
}