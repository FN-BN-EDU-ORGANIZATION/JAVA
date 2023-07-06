package C20230706;


class dist{
	static double getDistance(int x, int y, int x1, int y1) {
		double distanceSquared = Math.pow((x - x1), 2) + Math.pow((y - y1), 2);
		return Math.sqrt(distanceSquared);
	}
}


public class distance{

	public static void main(String[] args) {
		System.out.println(dist.getDistance(18,36,1,100));
	}
}