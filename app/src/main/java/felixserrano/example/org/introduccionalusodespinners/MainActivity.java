package felixserrano.example.org.introduccionalusodespinners;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    private TextView seleccion;

    private static final String[] items = {"En",
            "un", "lugar", "de", "la", "Mancha", "de", "cuyo", "nombre", "no", "quiero", "acordarme", "no",
            "ha", "mucho", "tiempo", "que", "vivía", "un", "hidalgo", "de", "los", "de", "lanza", "en",
            "astillero", "adarga", "antigua", "rocín", "flaco", "y", "galgo", "corredor" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seleccion = (TextView)findViewById(R.id.seleccion);

        Spinner spin = (Spinner)findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,
                items);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        seleccion.setText(items[i]);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        seleccion.setText("");
    }
}
