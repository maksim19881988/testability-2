public class BmiService {
    public int calculate(int w, double h) {
        double i = w / (h * h);
        return (int) i;
    }
}
