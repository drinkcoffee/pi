package temp.pi;

// Calculate pi using Gauss method.
// https://en.wikipedia.org/wiki/Gauss%E2%80%93Legendre_algorithm

public class Main {

    public static void main(String[] args) {
	    double a = 1.0;
	    double b = 1.0 / Math.sqrt(2);
	    double t = 1.0 / 4.0;
	    double p = 1.0;

	    int step = 5;

        double pi = Main.piGauss(step, a, b, t, p);

        System.out.println(pi);

    }

    public static double piGauss(int step, double a, double b, double t, double p) {
        double a1 = (a + b) / 2.0;
        double b1 = Math.sqrt(a * b);
        double t1 = t - p*(a - a1) * (a - a1);
        double p1 = 2 * p;

        int step1 = step - 1;
        if (step1 == 0) {
            return (a1 + b1) * (a1 + b1) / (4 * t1);

        }
        else {
            return piGauss(step1, a1, b1, t1, p1);
        }
    }
}
