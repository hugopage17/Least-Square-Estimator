import java.util.Scanner;
public class Input {

    public double yi;
    public double yj;
    public double ni;
    public double nj;
    public double tStat;
    public double Mse;

    public void RunInput(){
        LSDCalc lsdCalc = new LSDCalc();
        lsdCalc.tStat = this.tStat;
        GetDenominator denominator = new GetDenominator();
        denominator.MSe = this.Mse;
        denominator.ni = this.ni;
        denominator.nj = this.nj;

        System.out.println("Treatment 1 mean: ");
        Scanner sc = new Scanner(System.in);
        this.yi = sc.nextDouble();
        System.out.println("Treatment 2 mean: ");
        Scanner sc2 = new Scanner(System.in);
        this.yj = sc2.nextDouble();

        System.out.println("Sample size 1: ");
        Scanner sc3 = new Scanner(System.in);
        this.ni = sc3.nextDouble();
        System.out.println("Sample size 2: ");
        Scanner sc4 = new Scanner(System.in);
        this.ni = sc4.nextDouble();

        System.out.println("Mean Square Error");
        Scanner sc5 = new Scanner(System.in);
        this.Mse = sc5.nextDouble();

        System.out.println("T Statistic: ");
        Scanner sc6 = new Scanner(System.in);
        this.tStat = sc6.nextDouble();
    }
}
