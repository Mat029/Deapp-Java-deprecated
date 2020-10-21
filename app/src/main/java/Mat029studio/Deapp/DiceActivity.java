package Mat029studio.Deapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.security.SecureRandom;

import mat029studio.firstapp.deapp.R;


public class DiceActivity extends Activity implements View.OnClickListener {
    private TextView textResult;
    private int max;
    String nfaces1 , nfaces2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice);


        max = getIntent().getIntExtra("max", 0);
        nfaces1 = getString(R.string.dea);
        nfaces2 = getString(R.string.nfaces);

        TextView textTitle = (TextView) findViewById(R.id.faces);
        textTitle.setText(  nfaces1 + " " + max + " " + nfaces2 );

        textResult = ((TextView) findViewById(R.id.resultat));
        textResult.setText("");

        Button buttonRoll = (Button) findViewById(R.id.lancer);
        buttonRoll.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        SecureRandom random = new SecureRandom();
        int result = random.nextInt(max) + 1;
        textResult.setText(String.valueOf(result));
    }
}
