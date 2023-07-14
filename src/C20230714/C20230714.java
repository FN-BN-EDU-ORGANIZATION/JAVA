package mysutdy02_abstract;

/*
 * 추상 클래스 
 * 1. new 추상클래스() 이렇게 인스턴스 단독으로 만ㄷ늘지 못함 
 * 2. 다형성에서 왼쪽 부분을 담당할 수 잇다
 * 3. 특정 메소드를 반드시 구현해야 함을 강제할수있다 
 * 
 * 추상화한다 고양이 ,개 , 햄스터  공 : 포유류(잠 ,먹기, 놀)
 * 
 */
public abstract class Mammal {


		private String name;
		private int age;
		private String species;
		
		
		
		
		
		//Getter Setter 
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getSpecies() {
			return species;
		}
		public void setSpecies(String species) {
			this.species = species;
		}
		 
		
		//포유류에 대해서 추가적으로
		abstract void eat();
		abstract void sleep();
		abstract void cry();
		
		
		
		
		

		
	}


