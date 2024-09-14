public class Main {
    public static void main(String[] args){
        Santander santander1= new Santander(
                "Santander 1",
                "Joao",
                "Brasil",
                "Rua A",
                100,
                "BRL");
        JPMorgan mybank = new JPMorgan("insurance", "maria", "United States", "Street 1", 5000, "USS");

        //CreditCard cartao1=new CreditCard();
        Visa cartaovisa=new Visa("Ze", santander1, 1000);
        MasterCard cartaomaster=new MasterCard("Antonio", santander1, 1000);



        System.out.println(santander1.deposit(10));
        System.out.println(santander1.deposit(10));
        //System.out.println(cartao1.generateCreditCardNumber());
        System.out.println(cartaovisa.generateCreditCardNumber());
        System.out.println(cartaovisa.grantCreditLimit(1000));
        System.out.println(cartaomaster.generateCreditCardNumber());
        System.out.println(cartaomaster.grantCreditLimit(1000));
        System.out.println(mybank.deposit(100));
        System.out.println(mybank.withdraw(100));
        System.out.println(mybank.balance);

    }
}
