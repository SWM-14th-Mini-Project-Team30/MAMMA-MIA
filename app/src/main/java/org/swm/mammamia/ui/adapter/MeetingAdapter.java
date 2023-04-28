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

import java.util.List;

public class MeetingAdapter extends RecyclerView.Adapter<MeetingAdapter.ViewHolder> {

    private List<String> items;

    public MeetingAdapter(List<String> items) {
        this.items = items;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView meetingIv;
        TextView meetingTv;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            meetingIv = itemView.findViewById(R.id.iv_meeting);
            meetingTv = itemView.findViewById(R.id.tv_meeting);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.item_meeting, parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.meetingIv.setImageResource(R.drawable.ic_basic_image);
        holder.meetingTv.setText(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}