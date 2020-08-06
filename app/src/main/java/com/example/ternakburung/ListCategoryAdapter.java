package com.example.ternakburung;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListCategoryAdapter extends RecyclerView.Adapter<ListCategoryAdapter.ListViewHolder> {

    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }

    private ArrayList<Category> listCategory;
    public ListCategoryAdapter(ArrayList<Category> list){
        this.listCategory = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_category, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Category category = listCategory.get(position);
        Glide.with(holder.itemView.getContext())
                .load(category.getGambar())
                .apply(new RequestOptions().override(300,180))
                .into(holder.tvImage);
        holder.tvName.setText(category.getNama());

        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onItemClickCallback.onItemClicked(listCategory.get(holder.getAdapterPosition()));
            }
        });
    }

    public interface OnItemClickCallback{
        void onItemClicked(Category data);
    }

    @Override
    public int getItemCount() {
        return listCategory.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {

        ImageView tvImage;
        TextView tvName;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_nama_burung);
            tvImage= itemView.findViewById(R.id.tv_gambar);
        }
    }
}
