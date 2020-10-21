package Mat029studio.Deapp;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import mat029studio.firstapp.deapp.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button6 = (Button) findViewById(R.id.b6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DiceActivity.class);
                intent.putExtra("max", 6);
                startActivity(intent);
            }
        });

        Button button20 = (Button) findViewById(R.id.b20);
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DiceActivity.class);
                intent.putExtra("max", 20);
                startActivity(intent);
            }
        });
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_home:
                setContentView(R.layout.activity_main);

                Button button6 = (Button) findViewById(R.id.b6);
                button6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, DiceActivity.class);
                        intent.putExtra("max", 6);
                        startActivity(intent);
                    }
                });

                Button button20 = (Button) findViewById(R.id.b20);
                button20.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, DiceActivity.class);
                        intent.putExtra("max", 20);
                        startActivity(intent);
                    }
                });
                return true;
            case R.id.action_settings:
                setContentView(R.layout.activity_settings);
                return true;
            case R.id.action_search:
                /* DO DELETE */
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}