package cl.ubb.sandwichapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class sandwichView extends AppCompatActivity {

    private LinearLayout linearLayout;
    private int cantidadSandwiches;
    private Sandwich[] sandwichArray;
    private int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandwich_view);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        linearLayout = findViewById(R.id.LinearLayout);
        cantidadSandwiches = Integer.parseInt(getResources().getString(R.string.cantidadSandwiches));
        sandwichArray = new Sandwich[cantidadSandwiches];

        sandwichArray[0] = new Sandwich(getResources().getString(R.string.italianoNombre), getResources().getString(R.string.italianoIdPic), getResources().getString(R.string.italianoDescripcion), Integer.parseInt(getResources().getString(R.string.italianoPrecio)));
        sandwichArray[1] = new Sandwich(getResources().getString(R.string.barros_lucoNombre), getResources().getString(R.string.barros_lucoIdPic), getResources().getString(R.string.barros_lucoDescripcion), Integer.parseInt(getResources().getString(R.string.barros_lucoPrecio)));
        sandwichArray[2] = new Sandwich(getResources().getString(R.string.barros_jarpaNombre), getResources().getString(R.string.barros_jarpaIdPic), getResources().getString(R.string.barros_jarpaDescripcion), Integer.parseInt(getResources().getString(R.string.barros_jarpaPrecio)));
        sandwichArray[3] = new Sandwich(getResources().getString(R.string.chemilicoNombre), getResources().getString(R.string.chemilicoIdPic), getResources().getString(R.string.chemilicoDescripcion), Integer.parseInt(getResources().getString(R.string.chemilicoPrecio)));
        sandwichArray[4] = new Sandwich(getResources().getString(R.string.chacareroNombre), getResources().getString(R.string.chacareroIdPic), getResources().getString(R.string.chacareroDescripcion), Integer.parseInt(getResources().getString(R.string.chacareroPrecio)));

        for (i=0; i<cantidadSandwiches; i++){
            final Button btn = new Button(this);
            btn.setId(i);
            btn.setText(sandwichArray[i].getNombre());
            btn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    aboutView(v, sandwichArray[btn.getId()]);
                }
            });
            linearLayout.addView(btn);
        }
    }

    public void aboutView(View view, Sandwich s) {
        Intent aboutView = new Intent(this, detalleSandwich.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("1", s);
        aboutView.putExtras(bundle);
        startActivity(aboutView);
    }
}
