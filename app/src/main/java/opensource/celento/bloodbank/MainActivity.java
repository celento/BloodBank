package opensource.celento.bloodbank;


import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private DatabaseReference mFirebaseDatabase;
    private FirebaseDatabase mFirebaseInstance;
    private Button newb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFirebaseInstance = FirebaseDatabase.getInstance();

        // get reference to 'users' node
        mFirebaseDatabase = mFirebaseInstance.getReference();
        final EditText name = (EditText) findViewById(R.id.editText);
        final EditText mobile = (EditText) findViewById(R.id.editText3);
        newb = (Button) findViewById(R.id.button2);
        final Spinner blood = (Spinner) findViewById(R.id.spinner);
        final Spinner panch = (Spinner) findViewById(R.id.spinner2);

        newb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name1 = name.getText().toString();
                String mobile1 = mobile.getText().toString();
                String blood1 = blood.getSelectedItem().toString();
                String panch1 = panch.getSelectedItem().toString();
                String combo = name1 + "," + mobile1 + "," + panch1;
                usr newuser = new usr(name1, blood1, panch1);
                if (blood1.equals("") || mobile1.equals("") || panch1.equals("")) {
                    Toast.makeText(MainActivity.this, "Please fill all the details.", Toast.LENGTH_SHORT).show();
                } else {
                    mFirebaseDatabase.child("users").child(blood1).child(mobile1).setValue(combo);

                    Toast.makeText(MainActivity.this,"Donor Added",Toast.LENGTH_SHORT).show();
                    Intent home=new Intent(MainActivity.this,Home.class);
                    startActivity(home);
                    finish();
                }
            }
        });


    }
}
