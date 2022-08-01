package app.test.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //TODO: Доделать эту хуйню
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnClick(View view) {
        TextView txtFirstNameInput = findViewById(R.id.EditTextFirstName);
        TextView txtLastNameInput = findViewById(R.id.EditTextLastName);
        TextView txtEmailInput = findViewById(R.id.EditTextEmail);
        TextView txtFirstName = findViewById(R.id.textViewFirstName);
        TextView txtLastName = findViewById(R.id.textViewLastName);
        TextView txtEmail = findViewById(R.id.textViewEmail);

        txtFirstName.setText("First Name: " + txtFirstNameInput.getText().toString());
        txtLastName.setText("Last Name: " + txtLastNameInput.getText().toString());
        txtEmail.setText("Email: " + txtEmailInput.getText().toString());

    }
}