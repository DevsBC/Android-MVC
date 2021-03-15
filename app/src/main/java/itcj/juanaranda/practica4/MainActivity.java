package itcj.juanaranda.practica4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {


    private EditText editTextFullName;
    private EditText editTextAge;
    private EditText editTextControlNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextFullName = findViewById(R.id.fullName);
        editTextAge = findViewById(R.id.age);
        editTextControlNumber = findViewById(R.id.controlNumber);

        Button sendButton =  findViewById(R.id.sendForm);
        sendButton.setOnClickListener(v -> {
            Form newForm = getForm();
            Intent intent = new Intent(getApplicationContext(), FormData.class);
            intent.putExtra("form", newForm);
            startActivity(intent);
        });
    }

    private Form getForm() {
        String fullName = this.editTextFullName.getText().toString();
        int age = Integer.parseInt(this.editTextAge.getText().toString());
        int controlNumber = Integer.parseInt(this.editTextControlNumber.getText().toString());
        return new Form(fullName, age, controlNumber);
    }

}