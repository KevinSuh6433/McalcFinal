package ca.yorku.eecs.mcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class EntryForm extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mortgage_layout);
    }

    public void buttonClicked(View v)
    {
        EditText pView = (EditText) findViewById(R.id.pBox);
        String p = pView.getText().toString();

        EditText aView = (EditText) findViewById(R.id.aBox);
        String a = aView.getText().toString();

        EditText iView = (EditText) findViewById(R.id.iBox);
        String i = iView.getText().toString();

        MortgageModel myModel = new MortgageModel(p,a,i);
        String finalMortage = myModel.calcMortgage();

        ((TextView) findViewById(R.id.answer)).setText(finalMortage);
    }
}
