interface Maths {
	public void show();

	public void add(int a, int b); // 計算 a+b

	public void sub(int a, int b); // 計算 a-b

	public void mul(int a, int b); // 計算 a*b

	public void div(int a, int b); // 計算 a/b
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
		cmp.mul(3, 5); // 計算 3*5
		cmp.show(); // 此行會回應"ans=15"字串
	}
}