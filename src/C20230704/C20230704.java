package C20230704;


public class C20230704 {

}
//토이프로젝트 5시까지 했어요 흐규ㅠㅠㅠ
/*
 * 컨트롤러의 두가지 접근방식
 * 1.프론트컨트롤러만 사용하는방식
 * 2.서비스컨트롤러를 같이 사용하는 방식
 * 두개는 업케스팅과 다운캐스팅에 따라 발생하는 차이라고 생각하면된다.
 * 
 *  <프론트 컨트롤러만 사용하는 방식>
 *  // FrontController.java
public class FrontController {
    public void handleRequest(String request) {
        // 클라이언트 요청 분석 및 적절한 컨트롤러 호출
        if (request.equals("/home")) {
            HomeController homeController = new HomeController();
            homeController.processRequest();
        } else if (request.equals("/user")) {
            UserController userController = new UserController();
            userController.processRequest();
        } else {
            System.out.println("해당 URL에 대한 처리가 x");
        }
    }
}

// HomeController.java
public class HomeController {
    public void processRequest() {
        System.out.println("홈 페이지 요청 처리");
      
    }
}

// UserController.java
public class UserController {
    public void processRequest() {
        System.out.println("사용자 페이지 요청 처리");
        
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.handleRequest("/home"); // 홈 페이지 요청 처리
        frontController.handleRequest("/user"); // 사용자 페이지 요청 처리
        frontController.handleRequest("/product"); // 해당 URL에 대한 처리가 x
    }
}
----------------------------------------------------------------------------------------------


<서비스 컨트롤러를 사용했을때>
// FrontController.java
public class FrontController {
    private Map<String, SubController> subControllers;

    public FrontController() {
        subControllers = new HashMap<>();
        subControllers.put("/home", new HomeController());
        subControllers.put("/user", new UserController());
    }

    public void handleRequest(String request) {
        SubController subController = subControllers.get(request);
        if (subController != null) {
            subController.processRequest();
        } else {
            System.out.println("해당 URL에 대한 처리가 없습니다.");
        }
    }
}

// SubController.java
public interface SubController {
    void processRequest();
}

// HomeController.java
public class HomeController implements SubController {
    public void processRequest() {
        System.out.println("홈 페이지 요청 처리");
        // 홈 페이지 로직 수행
    }
}

// UserController.java
public class UserController implements SubController {
    public void processRequest() {
        System.out.println("사용자 페이지 요청 처리");
        // 사용자 페이지 로직 수행
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.handleRequest("/home"); // 홈 페이지 요청 처리
        frontController.handleRequest("/user"); // 사용자 페이지 요청 처리
        frontController.handleRequest("/product"); // 해당 URL에 대한 처리가 없습니다.
    }
 * */
 