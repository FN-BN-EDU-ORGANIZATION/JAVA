package 생활코딩;

public class LoginDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = args[0];
		String password = args[1];
		if(id.equals("egoing") && password.equals("1111")) {
			System.out.println("right");
		} else {
			System.out.println("wrong");
		} 
	}
}
