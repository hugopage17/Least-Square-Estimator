public class GetDenominator {
    public double denom;
    public double MSe;
    public double ni;
    public double nj;

    public void GetVal(){
        if(this.ni != this.nj)
        {
            double firstDiv = (1 / this.ni + 1 / this.nj);
            double beforeSq = this.MSe * firstDiv;
            double afterSq = Math.sqrt(beforeSq);
            this.denom = afterSq;
        }

        else if (this.ni == this.nj)
        {
            double val = Math.sqrt((2*this.MSe)/15);
            this.denom = val;
            System.out.println(val);
        }
    }
}
