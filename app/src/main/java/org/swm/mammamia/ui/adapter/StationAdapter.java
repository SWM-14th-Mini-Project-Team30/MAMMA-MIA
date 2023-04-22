package org.swm.mammamia.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.swm.mammamia.R;

import java.util.List;

public class StationAdapter extends BaseAdapter {

    private Context context;
    private List<String> items;

    public StationAdapter(Context context, List<String> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        View root = LayoutInflater.from(context).inflate(R.layout.item_station, viewGroup, false);
        TextView stationTv = root.findViewById(R.id.tv_station);
        stationTv.setText(items.get(position));

        return root;
    }
}
