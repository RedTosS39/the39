package android.example.the39project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class ProductsActivity extends AppCompatActivity {
    double price;
    int qty; // quantity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);
        getUserIntent();
    }

    void getUserIntent() {
        Intent getUserIntent = getIntent();
        String guestName = getUserIntent.getStringExtra("guestName");
        TextView productsTextView = findViewById(R.id.productsTextView);

        if(guestName.isEmpty() ) {
            productsTextView.setText("Привет, гость!");

        } else {
            productsTextView.setText("Привет, " + guestName + "!");
        }

    }

    public void plusOnClick(View view) {
        qty++;
        TextView quantity = findViewById(R.id.quantity);
        quantity.setText("" + qty);

    }

    public void minusOnClick(View view) {
        qty--;
        if(qty >= 0 ){
            TextView quantity = findViewById(R.id.quantity);
            quantity.setText("" + qty);
        } else { qty = 0; }

    }
}