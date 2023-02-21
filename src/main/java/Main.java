import ru.netology.javaqa.calcmonth.services.BonusService;

public class Main {

    public static void main(String[] args) {
        BonusService service = new BonusService();

        int expected = 3;
        int actual = service.calculate(10_000, 3_000, 20_000);
        System.out.println(expected + " == ? == " + actual);
    }

}
