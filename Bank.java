//package bank;
//
class Account{
    public String name;
    protected String email;
    private String password;
    //getter and setter
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String pass){
        this.password=pass;
    }

}
public class Bank {
    public static void main(String arg[]){
        Account account1=new Account();
        account1.name="Ankur";
        account1.email="Atul";
        account1.setPassword("abcd");
        System.out.println(account1.getPassword());
    }
}
