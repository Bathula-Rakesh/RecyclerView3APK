package com.example.recyclerview3apk;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter  extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    Context context;
    List<CustomModel> customModels = new ArrayList<>();

    public CustomAdapter(Context context, List<CustomModel> customModels) {
        this.context = context;
        this.customModels = customModels;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.customdesign,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CustomAdapter.ViewHolder holder, int position)
    {
        final  CustomModel temp = customModels.get(position);

        holder.imageView.setImageResource(customModels.get(position).getImage());
        holder.textView.setText(customModels.get(position).getNametext());

        holder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,gallery.class);
                intent.putExtra("image_name",temp.getImage());
                intent.putExtra("text_name",temp.getNametext());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
    });


    }

    @Override
    public int getItemCount() {
        return customModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        public ViewHolder( View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.image_icon_iv);
            textView = itemView.findViewById(R.id.name_tv);


        }
    }
}
