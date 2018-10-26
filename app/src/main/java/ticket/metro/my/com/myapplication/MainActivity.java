package ticket.metro.my.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<ItemsRec2> itemsRec2s = new ArrayList<>();
        itemsRec2s.add(new ItemsRec2("ahmed",R.drawable.ic_action_name));
        itemsRec2s.add(new ItemsRec2("ahmed",R.drawable.ic_action_name));
        itemsRec2s.add(new ItemsRec2("ahmed",R.drawable.ic_action_name));
        itemsRec2s.add(new ItemsRec2("ahmed",R.drawable.ic_action_name));
        itemsRec2s.add(new ItemsRec2("ahmed",R.drawable.ic_action_name));
        itemsRec2s.add(new ItemsRec2("ahmed",R.drawable.ic_action_name));
        itemsRec2s.add(new ItemsRec2("ahmed",R.drawable.ic_action_name));
        itemsRec2s.add(new ItemsRec2("ahmed",R.drawable.ic_action_name));
        itemsRec2s.add(new ItemsRec2("ahmed",R.drawable.ic_action_name));
        itemsRec2s.add(new ItemsRec2("ahmed",R.drawable.ic_action_name));
        itemsRec2s.add(new ItemsRec2("ahmed",R.drawable.ic_action_name));
        itemsRec2s.add(new ItemsRec2("ahmed",R.drawable.ic_action_name));
        itemsRec2s.add(new ItemsRec2("ahmed",R.drawable.ic_action_name));

        AdapterRec2 adapterRec2 = new AdapterRec2(this,itemsRec2s);

        ArrayList<ItmesRec1> itmesRec1s =new ArrayList<>();
        itmesRec1s.add(new ItmesRec1("Ahmed",adapterRec2));
        itmesRec1s.add(new ItmesRec1("Ramadan",adapterRec2));
        itmesRec1s.add(new ItmesRec1("moahmed",adapterRec2));
        itmesRec1s.add(new ItmesRec1("Ahmed",adapterRec2));
        itmesRec1s.add(new ItmesRec1("Ramadan",adapterRec2));
        itmesRec1s.add(new ItmesRec1("moahmed",adapterRec2));
        itmesRec1s.add(new ItmesRec1("Ahmed",adapterRec2));
        itmesRec1s.add(new ItmesRec1("Ramadan",adapterRec2));
        itmesRec1s.add(new ItmesRec1("moahmed",adapterRec2));

        AdapterRec1 adapterRec1 =new AdapterRec1(this,itmesRec1s);

        RecyclerView recyclerView =findViewById(R.id.recyclerMain);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapterRec1);
    }
}
