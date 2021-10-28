package com.demo.glassignment.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.demo.glassignment.R;
import com.demo.glassignment.data.model.details.Move;

import java.util.List;

public class MovesAdapter extends RecyclerView.Adapter<MovesAdapter.ViewHolder> {

    private List<Move> mMoves;

    public MovesAdapter(List<Move> mMoves) {
        this.mMoves = mMoves;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.list_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textView.setText(mMoves.get(position).getMove().getName());
    }

    @Override
    public int getItemCount() {
        return mMoves.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        public ViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textName);
        }
    }
}
