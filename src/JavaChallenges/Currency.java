package JavaChallenges;

import java.math.BigDecimal;
import java.util.Scanner;

final class Money{
    private static final String DOLLAR = "USD";
    private static final String EURO = "EUR";
    private static int ROUNDING_MODE = BigDecimal.ROUND_HALF_EVEN;
    private static int DECIMALS = 2;
    private BigDecimal amount;
    private String currency;

    public Money(){}

    public static Money valueOf(
            BigDecimal amount,
            String currency){
        return new Money(amount,currency);
    }

    //caller cant see this private constructor
    private Money(
            BigDecimal amount,
            String currency){
        this.amount = amount;
        this.currency = currency;
    }

    //currency converter
    public Money multiply(BigDecimal factor){
        return Money.valueOf(
                rounded(this.amount.multiply(factor)),
                this.currency.equals(DOLLAR) ? EURO : DOLLAR);
    }

    //round to 2 decimals
    private BigDecimal rounded(BigDecimal amount){
        return amount.setScale(DECIMALS, ROUNDING_MODE);
    }

    public BigDecimal getAmount(){
        return amount;
    }

    public String getCurrency(){
        return currency;
    }
}
public class Currency {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        BigDecimal a = sc.nextBigDecimal();
        String b = sc.nextLine();

        Money money = new Money();

        //money.valueOf(a,b);

        //money.multiply(a);

        System.out.println(money.valueOf(a,b));
    }
}
