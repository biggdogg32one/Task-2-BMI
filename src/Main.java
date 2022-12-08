public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();

        double bmi = service.calculate(74, 1.72);

        System.out.println(bmi);
    }
}