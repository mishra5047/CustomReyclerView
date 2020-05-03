package com.example.bookz;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bookz.Model.ItemAdapter;


import java.util.List;

public class BooksAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<ItemAdapter> mList;
    private Context mContext;

    public BooksAdapter(List<ItemAdapter> list, Context context){
        super();
        mList = list;
        mContext = context;
    }

    @NonNull
    @Override
    public BooksAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View booksView = LayoutInflater.from(mContext).inflate(R.layout.item_recycler, parent, false);

        ViewHolder viewHolder = new ViewHolder(booksView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        ItemAdapter itemAdapter = mList.get(position);

        ((ViewHolder) holder).rating.setText(itemAdapter.getRatings());
        ((ViewHolder) holder).authorName.setText(itemAdapter.getAuthorName());
        ((ViewHolder) holder).name.setText(itemAdapter.getName());
        ((ViewHolder) holder).image.setImageResource(itemAdapter.getImage());

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView rating, name, authorName;
        public ImageView image;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            rating = itemView.findViewById(R.id.ratingText);
            name = itemView.findViewById(R.id.titleText);
            authorName = itemView.findViewById(R.id.authorText);
            image = itemView.findViewById(R.id.image_item);

        }
    }
}
