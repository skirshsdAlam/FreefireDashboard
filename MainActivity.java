package com.freefire.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private GridView playerGridView;
    private Button btnWeapons, btnMap, btnLeaderboard;
    private TextView tvPlayerLevel, tvTotalKills, tvTotalWins, tvDiamonds;
    
    private List<Player> playerList;
    private PlayerAdapter playerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playerGridView = findViewById(R.id.playerGridView);
        tvPlayerLevel = findViewById(R.id.tvPlayerLevel);
        tvTotalKills = findViewById(R.id.tvTotalKills);
        tvTotalWins = findViewById(R.id.tvTotalWins);
        tvDiamonds = findViewById(R.id.tvDiamonds);
        btnWeapons = findViewById(R.id.btnWeapons);
        btnMap = findViewById(R.id.btnMap);
        btnLeaderboard = findViewById(R.id.btnLeaderboard);

        initializePlayerData();
        playerAdapter = new PlayerAdapter(this, playerList);
        playerGridView.setAdapter(playerAdapter);

        setupMainStats();

        btnWeapons.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, WeaponGuideActivity.class);
            startActivity(intent);
        });

        btnMap.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MapGuideActivity.class);
            startActivity(intent);
        });

        btnLeaderboard.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, LeaderboardActivity.class);
            startActivity(intent);
        });

        playerGridView.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(MainActivity.this, PlayerDetailsActivity.class);
            intent.putExtra("player", playerList.get(position));
            startActivity(intent);
        });
    }

    private void initializePlayerData() {
        playerList = new ArrayList<>();
        playerList.add(new Player("ProGamer_King", 60, 5420, 892, 5.8, "🥇", 45000));
        playerList.add(new Player("SniperMaster99", 58, 4850, 756, 5.2, "🥈", 38000));
        playerList.add(new Player("Legends_of_Fire", 57, 4320, 720, 4.9, "🥉", 35000));
        playerList.add(new Player("AssassinX", 56, 3920, 685, 4.5, "4", 32000));
        playerList.add(new Player("FireStorm_Elite", 55, 3450, 628, 4.2, "5", 28000));
        playerList.add(new Player("ShadowKing", 54, 3120, 590, 3.9, "6", 25000));
        playerList.add(new Player("NoobHunter", 53, 2850, 540, 3.6, "7", 22000));
        playerList.add(new Player("SnipeGod", 52, 2620, 510, 3.4, "8", 20000));
        playerList.add(new Player("FireStorm", 51, 2350, 480, 3.1, "9", 18000));
        playerList.add(new Player("YourPlayerName", 45, 1250, 380, 3.5, "🎖️", 12000));
    }

    private void setupMainStats() {
        tvPlayerLevel.setText("45");
        tvTotalKills.setText("1,250");
        tvTotalWins.setText("380");
        tvDiamonds.setText("5,450");
    }
}