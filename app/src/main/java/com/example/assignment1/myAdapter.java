package com.example.assignment1;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
public class myAdapter extends RecyclerView.Adapter<myAdapter.ViewHolder> {

    private String[] op;
    private String[] type;
    private String[] level;

    public myAdapter(String[] op, String[] type, String[] level){
        this.op = op;
        this.type = type;
        this.level = level;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CardView v = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.mycard,
                parent,
                false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CardView cardView = holder.cardView;
        TextView text1 = (TextView) cardView.findViewById(R.id.txt1);
        TextView text2 = (TextView) cardView.findViewById(R.id.txt2);
        TextView text3 = (TextView) cardView.findViewById(R.id.txt3);
        text1.setText("   Operation is: " + op[position]);
        text2.setText("   Type is: " + type[position]);
        text3.setText("   Level is: " + level[position]);
        cardView.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //
            }
        });
    }

    @Override
    public int getItemCount() {
        return op.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private CardView cardView;
        public ViewHolder(CardView cardView){
            super(cardView);
            this.cardView = cardView;
        }

    }

}
