package com.martin.designlibrary;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {

    private String[] items = {
            "worcestershire",
            "hobbledehoy",
            "interstratifying",
            "survival",
            "nonfungible",
            "credo",
            "overstale",
            "chiromantical",
            "grovet",
            "gamma",
            "matzoon",
            "kikldhes",
            "dauphin",
            "overspeculating",
            "sinicized",
            "hecataean",
            "suede",
            "olden",
            "nonresidence",
            "sniffier",
            "tutuila",
            "occupancy",
            "luncheon",
            "caquet",
            "alternatively",
            "unsterile",
            "indican",
            "subregion",
            "perrin"
    };

    @Override
    public int getItemCount() {
        return items.length;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(android.R.layout.simple_list_item_1, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        holder.tvText.setText(items[holder.getAdapterPosition()]);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tvText;

        public ViewHolder(View v) {
            super(v);
            tvText = (TextView) v.findViewById(android.R.id.text1);
        }
    }
}
