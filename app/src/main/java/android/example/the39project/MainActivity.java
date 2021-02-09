package android.example.the39project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText guestName;
  //  Order order = new Order();

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private  RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        guestName = findViewById(R.id.guestName);

        ArrayList <RecyclerViewItems> recyclerViewItemsList = new ArrayList();
        for (int i = 0; i < 5; i++) {
            recyclerViewItemsList.add(new RecyclerViewItems("Name", "Description", R.drawable.moyki));
        }
    }

//TODO: add to welcomeIntent  guest Name
 /*   public void welcomeClick(View view) {

        Intent welcomeIntent = new Intent(MainActivity.this, ProductsActivity.class);
        welcomeIntent.putExtra("guestName", order.);
        startActivity(welcomeIntent);
    }
*/
}