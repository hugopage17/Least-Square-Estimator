public class LSDCalc {
    public double mean1;
    public double mean2;
    public double mean3;
    public double tStat;

    public void Comparison(double yi, double yj, double diff, double denomin){
        diff = yi - yj;
        System.out.println("Difference " + diff);
        System.out.println("Tstatistic " + this.tStat);
        double LSD = this.tStat*denomin;
        System.out.println("LSD " + LSD);
    }

}
