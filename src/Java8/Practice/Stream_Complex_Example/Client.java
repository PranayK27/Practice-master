package Java8.Practice.Stream_Complex_Example;

public class Client {

    private final String name;
    private final String country;

    public Client(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
