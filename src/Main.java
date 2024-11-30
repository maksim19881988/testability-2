public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();
        int w = 98;
        double h = 1.87;
        int bmi = bmiService.calculate(w, h);
        System.out.println("Индекс массы тела : " + bmi);
    }
}
