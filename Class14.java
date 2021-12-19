interface iVolume {
	public void showData(); // ��ܲy�骺���

	public double vol(); // �p��y��n
}

abstract class CSphere implements iVolume {
	final double PI = 3.14;
	protected int x;
	protected int y;
}

class CCircles extends CSphere {
	protected int radius;

	public CCircles(int a, int b, int r) {
		x = a;
		y = b;
		radius = r;
	}

	public void showData() {
		System.out.println("�y��:(" + x + "," + y + ")");
		System.out.println("�b�|:" + radius);
		System.out.println("�y��n:" + vol());
	}

	public double vol() {
		return ((4.0 / 3) * PI * radius * radius * radius);
	}
}

public class Class14 {
	public static void main(String args[]) {
		CCircles cir = new CCircles(8, 6, 2);
		cir.showData();
	}
}