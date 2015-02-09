


import java.text.DecimalFormat;
import java.text.NumberFormat;


public class homework1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double  Fa = 0.0,
                Fb = 0.0,
                Fx = 0.0,
                Fax = 0.0,
                Error= 0.0;
        double xP = 1,xC =0,e = Math.E;
        double strA,strB;
        int term;
        NumberFormat formatter = new DecimalFormat("#0.000000");
        System.out.println(" find approx value x=1.5");
        System.out.println(" using Newton's divided difference interpolating  method");

        double x[] = {1.0,1.3,1.6,1.9,2.2};
        double fx[] = {0.7651977,0.6200860,0.4554022,0.281886,0.1103623};
        newton(fx, x);

    }


    public static double sin(double x){
        double sinx = Math.sin(x);
        double xpow2 = Math.pow(x, 2);
        double ans = sinx-xpow2+10;
        return ans;
    }
    public static void newton(double f[],double x[]) {
        NumberFormat formatter = new DecimalFormat("#0.0000000");
        double div[] = f.clone();
        int n=div.length;
        double a[]=new double[n];
        a[0] = div[0];
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                double divider = x[j + i] - x[j];
                System.out.println("term:["+i+"] F+1:" + div[j + i] + " F:" + div[j] + " X+1:" + x[j + i] + " X:" + x[j]);
                div[j] = (div[j + 1] - div[j]) / divider;
                System.out.println("Ans:"+formatter.format(div[j]));
            }
            a[i] = div[0];
        }

    }



}

