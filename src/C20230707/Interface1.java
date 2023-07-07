package C20230707;

//인터페이스 정의
interface Soundable {
 void makeSound();
}

//동물 관련 클래스
class Animal {
 private Soundable soundable;

 public Animal(Soundable soundable) {
     this.soundable = soundable;
 }

 public void makeSound() {
     soundable.makeSound();
 }
}

//개 클래스
class DogSound implements Soundable {
 public void makeSound() {
     System.out.println("멍멍!");
 }
}

//고양이 클래스
class CatSound implements Soundable {
 public void makeSound() {
     System.out.println("야옹!");
 }
}

//메인 클래스
public class Interface1 {
 public static void main(String[] args) {
     Soundable dogSound = new DogSound();
     Animal dog = new Animal(dogSound);
     dog.makeSound(); // 출력: 멍멍!

     Soundable catSound = new CatSound();
     Animal cat = new Animal(catSound);
     cat.makeSound(); // 출력: 야옹!
 }
}

