public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        int h = 77;
        double m = 1.70 * 1.70;
        double index = h + m;
        double bmi = service.calculate(index);

        System.out.println(bmi);
    }
}