public class Main {

    public static void main(String[] args){
        GetDenominator denominator = new GetDenominator();
        LSDCalc lsdCalc = new LSDCalc();
        Input inpt = new Input();

        denominator.MSe = 6.19;
        denominator.GetVal();
        inpt.RunInput();
        lsdCalc.Comparison(inpt.yi, inpt.yj, lsdCalc.mean1, denominator.denom);

        //First Comparison
        //lsdCalc.Comparison(10.8, 22.4, lsdCalc.mean1, firstVal.firstVal);
    }
}
