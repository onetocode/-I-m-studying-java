import static  java.lang.System.out;
class Account{
    String name;
    String adress;
    double balance;
    public  void display(){
        out.print(name);
        out.print("(");
        out.print(adress);
        out.print(") имеет на счету " + "$");
        out.print(balance);
    }
    public double getInterest (double percentageRate){
        return balance * percentageRate / 100;
    }
}


class Authenticator {
    public static void main(String[] args) {

        Account myAccount = new Account();
        Account yourAccount = new Account();

        myAccount.name = "Вася";
        myAccount.adress = "Невский 178";
        myAccount.balance = 24.02;
        yourAccount.name = "Марк";
        yourAccount.adress = "Ивановская 18";
        yourAccount.balance = 55.63;
        myAccount.display();
        out.print(" плюс $");
        out.printf("%.2f", myAccount.getInterest(5.00));
        out.println(" дохода");
        yourAccount.display();
        double yourInterestRate = 7.00;
        out.print(" плюс $");
        double yourInterestAmount = yourAccount.getInterest(yourInterestRate);
        out.printf("%.2f", yourInterestAmount);
        out.println(" дохода");
    }

}
