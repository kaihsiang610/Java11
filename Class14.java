interface iVolume {
	public void showData(); // 顯示球體的資料

	public double vol(); // 計算球體積
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
		System.out.println("球心:(" + x + "," + y + ")");
		System.out.println("半徑:" + radius);
		System.out.println("球體積:" + vol());
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