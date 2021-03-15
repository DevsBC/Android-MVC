package itcj.juanaranda.practica4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class FormData extends AppCompatActivity {

    Form form;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_data);

        TextView textViewFullName = findViewById(R.id.textView3);
        TextView textViewAge = findViewById(R.id.textView4);
        TextView textViewControlNumber = findViewById(R.id.textView5);

        if(getIntent().getExtras() != null) {
            form = (Form) getIntent().getSerializableExtra("form");
            textViewFullName.setText(form.getFullName());
            textViewAge.setText(String.valueOf(form.getAge()));
            textViewControlNumber.setText((String.valueOf(form.getControlNumber())));
            Toast.makeText(getApplicationContext(), "Formulario recibido", Toast.LENGTH_SHORT).show();
        }
    }
}