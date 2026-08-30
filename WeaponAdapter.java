package com.freefire.dashboard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;

public class WeaponAdapter extends BaseAdapter {
    private Context context;
    private List<Weapon> weaponList;
    private LayoutInflater inflater;

    public WeaponAdapter(Context context, List<Weapon> weaponList) {
        this.context = context;
        this.weaponList = weaponList;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return weaponList.size();
    }

    @Override
    public Object getItem(int position) {
        return weaponList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.weapon_item, parent, false);
            holder = new ViewHolder();
            holder.tvWeaponName = convertView.findViewById(R.id.tvWeaponName);
            holder.tvWeaponType = convertView.findViewById(R.id.tvWeaponType);
            holder.tvWeaponDesc = convertView.findViewById(R.id.tvWeaponDesc);
            holder.tvDamage = convertView.findViewById(R.id.tvDamage);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Weapon weapon = weaponList.get(position);
        holder.tvWeaponName.setText(weapon.getName());
        holder.tvWeaponType.setText(weapon.getType());
        holder.tvWeaponDesc.setText(weapon.getDescription());
        holder.tvDamage.setText("Damage: " + weapon.getDamage());

        return convertView;
    }

    private static class ViewHolder {
        TextView tvWeaponName;
        TextView tvWeaponType;
        TextView tvWeaponDesc;
        TextView tvDamage;
    }
}