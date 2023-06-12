package 정세인;

class Shopper{
   private int Holding;
   private int TakoCnt;
   
   public Shopper(int Holding, int TakoCnt) {
      
      this.Holding = Holding;
      this.TakoCnt = TakoCnt;
   }
   public void Payment(digger digger, int money)
   {
      Holding -= money;
      int cnt = digger.recipient(money);
      TakoCnt += cnt;
   }
   public void ShowInfo(){
      System.out.println("-----구매자정보-----");
      System.out.println("보유금액 : "+ Holding);
      System.out.println("타코야끼개수 : "+ TakoCnt);
   }
   
}

class digger{
   private int Holding;
   private int TakoCnt;
   public int Price;
   
   public digger(int Holding, int TakoCnt, int price) {
      super();
      this.Holding = Holding;
      this.TakoCnt = TakoCnt;
      Price = price;
   }
   public int recipient (int money) {
      
      Holding +=money;
      int revcnt = money/Price;
      TakoCnt -= revcnt;
      return revcnt;
   }
   public void ShowInfo() {
      System.out.println("-----판매자정보-----");
      System.out.println("보유금액 : "+ Holding);
      System.out.println("타코야끼개수 : "+ TakoCnt);
      System.out.println("개당가격 : "+ Price);
   }
}

public class Submit01 {
   public static void main(String[] args) {
   
 
      digger 타코야끼장수1= new digger(100000,100,1000);
       Shopper 서강준 = new Shopper(10000,0); 
       Shopper 박효신 = new Shopper(20000,0);
       Shopper 최정훈 = new Shopper(30000,0);
       서강준.Payment(타코야끼장수1,2000);
       박효신.Payment(타코야끼장수1,5000);
       최정훈.Payment(타코야끼장수1,3000);
       
       타코야끼장수1.ShowInfo();
       서강준.ShowInfo();
       박효신.ShowInfo();
       최정훈.ShowInfo();
    
  }
}