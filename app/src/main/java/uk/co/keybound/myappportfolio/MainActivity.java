package uk.co.keybound.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Context context;
    private CharSequence text = "This button will launch my ";
    private int duration = Toast.LENGTH_SHORT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this.getApplicationContext();
    }
    public void onClick(View v){
        Button b = (Button)v;
        String buttonText = b.getText().toString();
        Toast.makeText(context,text + buttonText + " app",duration).show();
    }
}
