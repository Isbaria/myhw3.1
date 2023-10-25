public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price); // должно получиться 500
        System.out.println(miles);

        System.out.println("Price 5 000");
        System.out.println(service.calculate(5_000));

        System.out.println("Price 1 000");
        System.out.println(service.calculate(1_000));

        System.out.println("Price 20 000");
        System.out.println(service.calculate(20_000));
    }
}