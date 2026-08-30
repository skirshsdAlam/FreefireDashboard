package com.freefire.dashboard;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MapGuideActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_guide);

        TextView tvMapInfo = findViewById(R.id.tvMapInfo);
        
        String mapInfo = "🗺️ BERMUDA MAP\n\n" +
                "Key Locations:\n" +
                "🏚️ Clock Tower - Safe loot, central\n" +
                "🏭 Factory - High risk, great loot\n" +
                "🏥 Hospital - Medical supplies\n" +
                "🏪 Market - Weapons & equipment\n" +
                "🌳 Diner - Quick loot spot\n" +
                "⛪ Chapel - Hidden weapons\n" +
                "🎪 Carnival - Good loot, risky\n" +
                "🌲 Woodlands - Sniper friendly\n" +
                "🏖️ Riverside - Long range combat\n" +
                "🏰 Castle - Luxury loot\n\n" +
                "Tips:\n" +
                "• Land in less crowded areas first\n" +
                "• Use elevation to your advantage\n" +
                "• Stay inside the safe zone\n" +
                "• Use vehicles wisely\n" +
                "• Watch for supply drops\n" +
                "• Peak at common landing spots";
        
        tvMapInfo.setText(mapInfo);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("🗺️ Map Guide");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}