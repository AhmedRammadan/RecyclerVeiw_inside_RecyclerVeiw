package ticket.metro.my.com.myapplication;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterRec1 extends RecyclerView.Adapter<AdapterRec1.ViewHolder> {
    Context context ;
    ArrayList<ItmesRec1> listItems;

    public AdapterRec1(Context context, ArrayList<ItmesRec1> listItems) {
        this.context = context;
        this.listItems = listItems;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(context).inflate(R.layout.rec1,null);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.category.setText(listItems.get(i).getCategory());
        viewHolder.recyclerRe1.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false));
        viewHolder.recyclerRe1.setAdapter(listItems.get(i).adapterRec2);
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView category;
        RecyclerView recyclerRe1;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            category = itemView.findViewById(R.id.category);
            recyclerRe1 = itemView.findViewById(R.id.recyclerRe1);
        }
    }
}
