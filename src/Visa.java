import java.util.Random;

public class Visa extends CreditCard {

    public Visa(String ownerName, IBank bank, double monthlyIncome) {
        super(ownerName, bank, monthlyIncome);
    }

    public String generateCreditCardNumber(){
        Random random=new Random();
        StringBuilder cardNumber=new StringBuilder();
        //start with number 3
        cardNumber.append(3);

        for(int i=0; i<15; i++){
            int digit=random.nextInt(10);
            cardNumber.append(digit);
        }
        return cardNumber.toString();
    }


    public double grantCreditLimit(double monthlyIncome){
        return monthlyIncome*2;
    }
}
