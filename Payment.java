


package fitnesshive;
 import java.util.Scanner; 



public class Payment {
 private String CardNum;
    private String ExpirationDate;
    private String CardName;
    private double price;
    private double dis;
    
    Scanner input = new Scanner(System.in);
    
    

    public Payment() {
    }
    
    
    

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
    public String getExpirationDate() {
        return ExpirationDate;
    }

    public void setExpirationDate(String ExpirationDate) {
        this.ExpirationDate = ExpirationDate;
    }

    public String getCardNum() {
        return CardNum;
    }

    public void setCardNum(String CardNum) {
        this.CardNum = CardNum;
    }

    public String getCardName() {
        return CardName;
    }

    public void setCardName(String CardName) {
        this.CardName = CardName;
    }

    public double getDis() {
        return dis;
    }

    public void setDis(double dis) {
        this.dis = dis;
    }
    
    
    
    
    public Payment(String CardNum, String ExpirationDate, String CardName,double price,double dis) {
        this.CardNum = CardNum;
        this.ExpirationDate = ExpirationDate;
        this.CardName = CardName;
        this.price = price;
        this.dis=dis;
    }
    
    
  
    
    
    
    
    
    
    
    
    public static double MakePayment(double price){
        Scanner input = new Scanner(System.in);
        System.out.println("Total amount: " + price);
                    System.out.println("Enter the discount code: " );
                    String discount = input.next();
                    Discount(price,discount);
                    return price;
                    
        
             
    }
      
    public static double Discount(double amount , String discount ){
        double price=0.0 ;
        double dis = 0.15;
        if(discount.equals("IT21")){
            
            if(amount==300){
            price = 300 - (300 * dis);
            dis=0;
            System.out.println("Price After Discount: " + price); 
            
            }else if(amount==500){
                price = 500 - (500 * dis);
                dis=0;
                System.out.println("price after discount: " + price);
                
            }else if(amount==900){
                price = 900 - (900 * dis);
                dis=0;
                System.out.println("price after discount: " + price);
            }    
           
        }else{
             System.out.println("-----------------------------------------------------------------------");
            price = amount; 
            System.out.println("sorry the discount code is wrong, the total proce is  " + price);
        } 
       return price;
    }
     
    
}


