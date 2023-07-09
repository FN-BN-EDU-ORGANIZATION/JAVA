package C0707;

class Result{
//	더하기를 실행하는 메서드, double형의 x,y를 받아 double형으로 결과를 return
	double add(double x,double y) {
		return x+y;
	}
//	빼기를 실행하는 메서드, double형의 x,y를 받아 double형으로 결과를 return
	double min(double x,double y) {
		return x-y;
	}
//	곱하기를 실행하는 메서드, double형의 x,y를 받아 double형으로 결과를 return
	double mul(double x,double y) {
		return x*y;
	}
//	나누기를 실행하는 메서드, double형의 x,y를 받아 double형으로 결과를 return
	double div(double x,double y) {
		return x/y;
	}
}

public class C02Ex {
	public static void main(String[] args) {
		Result r = new Result();
		System.out.println("10.5 - 5.5 = "+r.min(10.5, 5.5));
		System.out.println("4.0 * 5.0 = "+r.mul(4.0, 5.0));
		System.out.println("100 / 25 = "+r.div(100, 25));
		System.out.println("10.0 + 3.0 = "+r.add(10.0, 3.0));
	}
}
