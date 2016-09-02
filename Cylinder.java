//Hayden McMullin
//U1A2 Clyinder class
public class Cylinder {
	private int height;
	private int radius;

	public Cylinder() {
		height = 5;
		radius = 2;
	}

	public double surfaceArea() {
		double ans, ans1, ans2;
		ans1 = 2 * 3.14 * radius * radius;
		ans2 = 2 * 3.14 * radius * height;
		ans = ans1 + ans2;

		return ans;
	}

	public double volume() {
		return 3.14 * radius * radius * height;
	}

	public int getRadius() {
		return radius;
	}

	public int getHeight() {
		return height;
	}
}
/* output 
 * 2 5
 *
 * Surface Area = 87.92 \
 * Volume = 62.800000000000004
 */