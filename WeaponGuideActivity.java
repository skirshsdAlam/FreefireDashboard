package com.freefire.dashboard;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class WeaponGuideActivity extends AppCompatActivity {

    private ListView lvWeapons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weapon_guide);

        lvWeapons = findViewById(R.id.lvWeapons);

        List<Weapon> weaponList = new ArrayList<>();
        weaponList.add(new Weapon("AK47", "Assault Rifle", "High damage, good range", "95"));
        weaponList.add(new Weapon("AWM", "Sniper Rifle", "One shot kill, long range", "100"));
        weaponList.add(new Weapon("MP40", "SMG", "Fast fire rate, close range", "75"));
        weaponList.add(new Weapon("M4A1", "Assault Rifle", "Balanced, versatile", "85"));
        weaponList.add(new Weapon("M249", "LMG", "High magazine, sustained fire", "80"));
        weaponList.add(new Weapon("FAMAS", "Assault Rifle", "Quick burst fire", "82"));
        weaponList.add(new Weapon("Dragunov", "Sniper Rifle", "Semi-auto sniper", "92"));
        weaponList.add(new Weapon("P90", "SMG", "High capacity magazine", "78"));

        WeaponAdapter adapter = new WeaponAdapter(this, weaponList);
        lvWeapons.setAdapter(adapter);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("🔫 Weapon Guide");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}