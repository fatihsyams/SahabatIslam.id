package com.fatihsyams.sahabatislamiid.ceramah;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.fatihsyams.sahabatislamiid.R;

class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {
    int[] gambarUlama = {R.drawable.hasyim, R.drawable.aminmaruf, R.drawable.habibrizieq, R.drawable.uas};
    String[] namaUlama = {"KH. HASYIM ASY'ARI", "Amien Ma'Ruf", "H. Habib Rizieq", "Ustad Abdul Somad"};
    Context context;
    public MainAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(context).inflate(R.layout.activity_layout_ceramah, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.tvUlama.setText(namaUlama[i]);
        viewHolder.imgUlama.setImageResource(gambarUlama[i]);

    }

    @Override
    public int getItemCount() {
        return namaUlama.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgUlama;
        TextView tvUlama;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            setInit();
        }

        private void setInit() {
            imgUlama = itemView.findViewById(R.id.img_ulama);
            tvUlama = itemView.findViewById(R.id.tv_ulama);

        }


    }
}
