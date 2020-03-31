package cl.ubb.sandwichapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button botonSandwiches;
    private Button botonAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonAbout = findViewById(R.id.botonAbout);
        botonSandwiches = findViewById(R.id.botonSandwiches);
    }

    public void aboutView(View view) {
        Intent aboutView = new Intent(this, aboutView.class);
        startActivity(aboutView);
    }

    public void sandwichView(View view) {
        Intent sandwichView = new Intent(this, sandwichView.class);
        startActivity(sandwichView);
    }
}
