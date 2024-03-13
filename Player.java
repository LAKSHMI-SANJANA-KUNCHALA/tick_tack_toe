package player;

public class Player {
   private String name;
   private int age;
   private char symbol;
   private String email;
   private String phno;
   private String address;
    public Player(String name,int age,char symbol,String phno,String email,String address){
        this.name=name;
        this.age=age;
        this.symbol=symbol;
        this.phno=phno;
        this.email=email;
        this.address=address;
    } 
    public String getPlayername(){
        return this.name;
    }
    public int getPlayerage(){
        return this.age;
    }
    public char getPlayersym(){
        return this.symbol;
    }
    public String getPlayerphno(){
        return this.phno;
    }
    public String getPlayeremail(){
        return this.email;
    }
    public String getPlayeraddress(){
        return this.address;
    }
    public void changesymbol(char sym){
        this.symbol=sym;
    }
    public void getplayerdetails(){
        System.out.println("name:"+this.name);
         System.out.println("age:"+this.age);
        System.out.println("symbol:"+this.symbol);
        System.out.println("phno:"+this.phno);
        System.out.println("email:"+this.email);
        System.out.println("address:"+this.address);
    }
    
    
}
