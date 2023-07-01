package Songjaeuk.D230630;

public class Getter_setter01 {
private  int price;//field price
private String title;

//필드의 값을 수정하고 얻기 위한 메소드를 만든다. setter,getter
//setter,getter - 프로퍼티(property)- price property


public int getPrice() {
    return this.price*2; //this는 내 자신 인스턴스를 참조하는 예약어.
                        //static메소드는 인스턴스가 생성되지 않아도 사용 할 수 있기 때문에 static메소드에서는 this를 사용할 수 없다
}

public String getTitle() {
    return title;
}

public void setTitle(String title) {
    this.title = title;
}

public void setPrice(int price) {//지역변수 price
    this.price = price;
	}
}

