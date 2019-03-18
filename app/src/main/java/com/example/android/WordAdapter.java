package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends RecyclerView.Adapter<WordAdapter.ViewHolder> {

    private Context mContext;
    private ArrayList<Word> mData;
    private int mColorResId;

    public WordAdapter(Context mContext, ArrayList<Word> mData, int colorResId) {
        this.mContext = mContext;
        this.mData = mData;
        this.mColorResId = colorResId;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(mContext).inflate(R.layout.list_item,parent,false);
       ViewHolder viewHolder = new ViewHolder(view);
       view.setBackgroundColor(ResourcesCompat.getColor(mContext.getResources(),mColorResId,mContext.getTheme()));
       return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Word word = mData.get(position);
        holder.miwoktextView.setText(word.getMiwokWord());
        if (word.hasImage()){
            holder.imageView.setVisibility(View.VISIBLE);
            holder.imageView.setImageResource(word.getImageResId());
        }else{
            holder.imageView.setVisibility(View.GONE);
        }


    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
       final TextView miwoktextView;
       final ImageView imageView;

        public ViewHolder (View itemView){
            super(itemView);
            miwoktextView = itemView.findViewById(R.id.miwok_textView);
            imageView = itemView.findViewById(R.id.imageView2);

            itemView.setClickable(true);
            itemView.setFocusable(true);
        }

    }
}
