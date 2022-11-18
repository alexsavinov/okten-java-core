package lesson02.hw01;


public class Main {
    public static void main(String[] args) {

        Geo geo = new Geo.GeoBuilder()
                .lat("-37.3159")
                .lng("81.1496")
                .build();

        Address address = new Address.AddressBuilder()
                .street("Kulas Light")
                .suite("Apt. 556")
                .city("Gwenborough")
                .zipcode("92998-3874")
                .geo(geo)
                .build();

        Company company = new Company.CompanyBuilder()
                .name("Romaguera-Crona")
                .catchPhrase("Multi-layered client-server neural-net")
                .bs("harness real-time e-markets")
                .build();

        User user = new User.UserBuilder()
                .id(1)
                .name("Leanne Graham")
                .username("Bret")
                .phone("1-770-736-8031 x56442")
                .website("hildegard.org")
                .address(address)
                .company(company)
                .build();

        System.out.println(user);

    }
}
