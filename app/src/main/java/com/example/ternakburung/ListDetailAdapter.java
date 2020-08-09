package com.example.ternakburung;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListDetailAdapter extends RecyclerView.Adapter<ListDetailAdapter.ListViewHolder> {


    private ArrayList<Detail> listDetail;

    public ListDetailAdapter(ArrayList<Detail> list){
        this.listDetail = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_detail, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Detail detail = listDetail.get(position);

        Glide.with(holder.itemView.getContext())
                .load(detail.getGambar())
                .apply(new RequestOptions().override(300,180))
                .into(holder.tv_gambar);

        holder.tv_kode.setText(detail.getKode());
        holder.tv_netas.setText(detail.getTanggal());
        holder.tv_kandang.setText(detail.getKandang());
        holder.tv_jantan.setText(detail.getJantan());
        holder.tv_betina.setText(detail.getBetina());

    }

    @Override
    public int getItemCount() {
        return listDetail.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {

        TextView tv_kode, tv_netas, tv_kandang, tv_jantan, tv_betina;

        ImageView tv_gambar;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_kode = itemView.findViewById(R.id.no_ring);
            tv_netas = itemView.findViewById(R.id.netas);
            tv_kandang = itemView.findViewById(R.id.kandang);
            tv_jantan = itemView.findViewById(R.id.jantanan);
            tv_betina = itemView.findViewById(R.id.betina);
            tv_gambar = itemView.findViewById(R.id.gambar_burung);
        }
    }
}
