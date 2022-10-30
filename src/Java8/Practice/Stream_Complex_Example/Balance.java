package Java8.Practice.Stream_Complex_Example;

public class Balance {

    private final Client client;
    private final int year;
    private final int amount;

    public Balance(Client client, int year, int amount) {
        this.client = client;
        this.year = year;
        this.amount = amount;
    }

    public Client getClient() {
        return client;
    }

    public int getYear() {
        return year;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Balance{" +
                "client=" + client +
                ", year=" + year +
                ", amount=" + amount +
                '}';
    }
}
