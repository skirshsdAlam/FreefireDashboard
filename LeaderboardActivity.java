package com.freefire.dashboard;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class LeaderboardActivity extends AppCompatActivity {

    private ListView lvLeaderboard;
    private List<Player> topPlayers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaderboard);

        lvLeaderboard = findViewById(R.id.lvLeaderboard);
        initializeTopPlayers();

        LeaderboardAdapter adapter = new LeaderboardAdapter(this, topPlayers);
        lvLeaderboard.setAdapter(adapter);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("🏅 Top Players");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    private void initializeTopPlayers() {
        topPlayers = new ArrayList<>();
        topPlayers.add(new Player("ProGamer_King", 60, 5420, 892, 5.8, "🥇", 45000));
        topPlayers.add(new Player("SniperMaster99", 58, 4850, 756, 5.2, "🥈", 38000));
        topPlayers.add(new Player("Legends_of_Fire", 57, 4320, 720, 4.9, "🥉", 35000));
        topPlayers.add(new Player("AssassinX", 56, 3920, 685, 4.5, "4", 32000));
        topPlayers.add(new Player("FireStorm_Elite", 55, 3450, 628, 4.2, "5", 28000));
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}