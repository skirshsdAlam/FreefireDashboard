package com.freefire.dashboard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;

public class PlayerAdapter extends BaseAdapter {
    private Context context;
    private List<Player> playerList;
    private LayoutInflater inflater;

    public PlayerAdapter(Context context, List<Player> playerList) {
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
            convertView = inflater.inflate(R.layout.player_card_item, parent, false);
            holder = new ViewHolder();
            holder.tvPlayerName = convertView.findViewById(R.id.tvPlayerName);
            holder.tvPlayerLevel = convertView.findViewById(R.id.tvPlayerLevel);
            holder.tvPlayerKills = convertView.findViewById(R.id.tvPlayerKills);
            holder.tvPlayerRank = convertView.findViewById(R.id.tvPlayerRank);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Player player = playerList.get(position);
        holder.tvPlayerName.setText(player.getName());
        holder.tvPlayerLevel.setText("Lvl: " + player.getLevel());
        holder.tvPlayerKills.setText("Kills: " + player.getKills());
        holder.tvPlayerRank.setText(player.getRank());

        return convertView;
    }

    private static class ViewHolder {
        TextView tvPlayerName;
        TextView tvPlayerLevel;
        TextView tvPlayerKills;
        TextView tvPlayerRank;
    }
}