package ca.yorku.eecs.mcalc;

import android.widget.DatePicker;

import java.util.Locale;

public class MortgageModel
{
    private double p;
    private double a;
    private double i;

    public MortgageModel(String p, String a, String i)
    {
        this.p = Double.parseDouble(p);
        this.a = Double.parseDouble(a);
        this.i = Double.parseDouble(i);
    }

    public String calcMortgage()
    {
        double mortgage = (((this.i/100)/12)*this.p)/(1- Math.pow((1+(this.i/100)/12),-(this.a*12)));
        return String.format(Locale.CANADA, "$%,.2f",mortgage);
    }
}
