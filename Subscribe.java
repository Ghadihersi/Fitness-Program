package fitnesshive;
import java.text.SimpleDateFormat;
import java.util.*;




public class Subscribe {
    private int ClientID;
    private String pkg1= "3 Months, 300 SR";
    private String  pkg2= "6 Month, 500 SR";
    private String  pkg3= "1 Year, 900 SR"; 
    private  Date  activationDate=new Date();
    
    
    
     //constrctors
    public Subscribe() {
    }

    public Subscribe(int ClientID, String pkg1, String pkg2, String pkg3) {
        this.ClientID = ClientID;
        this.pkg1 = pkg1;
        this.pkg2 = pkg2;
        this.pkg3 = pkg3;  
    }

    //setters and getters

    public String getPkg1() {
        return pkg1;
    }

    public void setPkg1(String pkg1) {
        this.pkg1 = pkg1;
    }

    public String getPkg2() {
        return pkg2;
    }

    public void setPkg2(String pkg2) {
        this.pkg2 = pkg2;
    }

    public String getPkg3() {
        return pkg3;
    }

    public void setPkg3(String pkg3) {
        this.pkg3 = pkg3;
    }
   
 
    public int getClientID() {
        return ClientID;
    }
    
    

    public void setClientID(int ClientID) {
        this.ClientID = ClientID;
    }

   
    public String ExpirationDate(String pkg){
      
       SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
      Calendar c = Calendar.getInstance();
      c.setTime(new Date()); 
      c.add(Calendar.DATE, 5); 

        
        if (pkg.equalsIgnoreCase(pkg1)){
            c.add(Calendar.DATE, 90);
           String output = sdf.format(c.getTime());
            
        }else if(pkg.equalsIgnoreCase(pkg2)){
            c.add(Calendar.DATE, 180);
            String output = sdf.format(c.getTime());
        
            
        }else
           c.add(Calendar.DATE, 360); 
           String output = sdf.format(c.getTime());
           
           return output;
    }
    
    
    public void printSubscrbtionInfo(String pkg){
      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
      Calendar c = Calendar.getInstance();
      c.setTime(activationDate); 
      String actDate= sdf.format(c.getTime()); 
        System.out.println("Congrats your subscrption on FitnessHive is activated on date of:  "+actDate+"\nthe subscrption Duration and price is before duration "+pkg+"\nThe subscrption will expire automatically at date of:"+ExpirationDate(pkg));
        System.out.println("-----------------------------------------------------------------------");
    }
    
    
    
}
