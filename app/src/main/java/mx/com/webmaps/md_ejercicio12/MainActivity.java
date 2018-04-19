package mx.com.webmaps.md_ejercicio12;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    CardView card1;
    CardView card2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        card1 = (CardView)findViewById(R.id.cardView1_id);
        card2 = (CardView)findViewById(R.id.cardView2_id);

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"CardView 1 is selected",Snackbar.LENGTH_LONG).show();
            }
        });


        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"CardView 2 is selected",Snackbar.LENGTH_LONG).show();
            }
        });

    }
}
