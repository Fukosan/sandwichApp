package cl.ubb.sandwichapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class aboutView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_view);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
