package org.swm.mammamia.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.swm.mammamia.R;
import org.swm.mammamia.ui.home.WritingItem;

import java.util.List;

public class WritingAdapter extends RecyclerView.Adapter<WritingAdapter.ViewHolder> {

    private List<WritingItem> items;

    public WritingAdapter(List<WritingItem> items) {
        this.items = items;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView writingIv;
        TextView titleTv;
        TextView categoryTv;
        TextView sakeTv;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            writingIv = itemView.findViewById(R.id.iv_writing);
            titleTv = itemView.findViewById(R.id.tv_title);
            categoryTv = itemView.findViewById(R.id.tv_category);
            sakeTv = itemView.findViewById(R.id.tv_sake);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.item_writing, parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.writingIv.setImageResource(R.drawable.ic_basic_image);
        holder.titleTv.setText(items.get(position).getTitle());
        holder.categoryTv.setText(items.get(position).getCategory());
        holder.sakeTv.setText(items.get(position).getSake());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
