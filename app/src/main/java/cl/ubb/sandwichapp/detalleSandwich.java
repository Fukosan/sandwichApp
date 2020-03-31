package cl.ubb.sandwichapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class detalleSandwich extends AppCompatActivity {

    private TextView tituloSandwich;
    private ImageView imagenSandwich;
    private TextView descripcionSandwich;
    private TextView precioSandwich;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_sandwich);

       Sandwich sandwich = (Sandwich) getIntent().getSerializableExtra("1");

        tituloSandwich = findViewById(R.id.tituloSandwich);
        imagenSandwich = findViewById(R.id.imagenSandwich);
        descripcionSandwich = findViewById(R.id.descripcionSandwich);
        precioSandwich = findViewById(R.id.precioSandwich);

        Resources res = getResources();
        int resID = res.getIdentifier(sandwich.getIdPic() , "drawable", getPackageName());
        imagenSandwich.setImageResource(resID);
        tituloSandwich.setText(sandwich.getNombre());
        descripcionSandwich.setText(sandwich.getDescripcion());
        precioSandwich.setText( "Precio: $" + String.valueOf(sandwich.getPrecio()));
    }
}
