package Songjaeuk.D230630;





//Person 클래스 정의
class Person {
 private String name; // 이름을 저장하는 private 인스턴스 변수

 // 이름 getter 메서드
 public String getName() {
     return name;
 }

 // 이름 setter 메서드
 public void setName(String name) {
     this.name = name;
 }

 // 이름을 출력하는 메서드
 public void showInfo() {
     System.out.println("이름 : " + name);
 }

 // 오버라이딩이 불가능한 메서드
 public final void whoAreYou() {
     System.out.println("이름 : ");
 }
}

//BusinessPerson 클래스 정의
public class BusinessPerson extends Person {
 private String company; // 회사를 저장하는 private 인스턴스 변수

 // 회사 getter 메서드
 public String getCompany() {
     return company;
 }

 // 회사 setter 메서드
 public void setCompany(String company) {
     this.company = company;
 }

 // Person 클래스의 showInfo 메서드를 오버라이딩하여 이름과 회사 출력
 @Override
 public void showInfo() {
     System.out.println("이름 : 김철수\t회사 : " + company);
 }

 // 오버로딩된 showInfo 메서드로 id를 출력하고 showInfo를 호출하여 정보 출력
 public void showInfo(int id) {
     System.out.println("id : " + id);
     showInfo();
 }
}

//Main 클래스 정의
class Main {
 public static void main(String[] args) {
     // Person 클래스의 인스턴스 생성
     Person p1 = new Person();
     p1.setName("김철수"); // 이름 설정
     p1.showInfo(); // 이름 출력
     System.out.println();

     // BusinessPerson 클래스의 인스턴스 생성
     BusinessPerson p2 = new BusinessPerson();
     p2.setName("홍길동"); // 이름 설정
     p2.setCompany("(주)조선"); // 회사 설정
     p2.showInfo(); // 이름과 회사 출력
 }
}