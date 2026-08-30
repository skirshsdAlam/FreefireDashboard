package com.freefire.dashboard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;

public class LeaderboardAdapter extends BaseAdapter {
    private Context context;
    private List<Player> playerList;
    private LayoutInflater inflater;

    public LeaderboardAdapter(Context context, List<Player> playerList) {
        this.context = context;
        this.playerList = playerList;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return playerList.size();
    }

    @Override
    public Object getItem(int position) {
        return playerList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.leaderboard_item, parent, false);
            holder = new ViewHolder();
            holder.tvRank = convertView.findViewById(R.id.tvRank);
            holder.tvName = convertView.findViewById(R.id.tvName);
            holder.tvKills = convertView.findViewById(R.id.tvKills);
            holder.tvWins = convertView.findViewById(R.id.tvWins);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Player player = playerList.get(position);
        holder.tvRank.setText(player.getRank());
        holder.tvName.setText(player.getName());
        holder.tvKills.setText(String.valueOf(player.getKills()));
        holder.tvWins.setText(String.valueOf(player.getWins()));

        return convertView;
    }

    private static class ViewHolder {
        TextView tvRank;
        TextView tvName;
        TextView tvKills;
        TextView tvWins;
    }
}