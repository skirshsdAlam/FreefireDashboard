package com.freefire.dashboard;

import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class PlayerDetailsActivity extends AppCompatActivity {

    private TextView tvPlayerName, tvPlayerLevel, tvTotalKills, tvTotalWins;
    private TextView tvKdRatio, tvDiamonds, tvHeadshots, tvAccuracy;
    private ProgressBar pbLevel, pbKills;
    private Player player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_details);

        player = (Player) getIntent().getSerializableExtra("player");

        tvPlayerName = findViewById(R.id.tvPlayerName);
        tvPlayerLevel = findViewById(R.id.tvPlayerLevel);
        tvTotalKills = findViewById(R.id.tvTotalKills);
        tvTotalWins = findViewById(R.id.tvTotalWins);
        tvKdRatio = findViewById(R.id.tvKdRatio);
        tvDiamonds = findViewById(R.id.tvDiamonds);
        tvHeadshots = findViewById(R.id.tvHeadshots);
        tvAccuracy = findViewById(R.id.tvAccuracy);
        pbLevel = findViewById(R.id.pbLevel);
        pbKills = findViewById(R.id.pbKills);

        if (player != null) {
            tvPlayerName.setText(player.getName());
            tvPlayerLevel.setText("Level: " + player.getLevel());
            tvTotalKills.setText("Kills: " + player.getKills());
            tvTotalWins.setText("Wins: " + player.getWins());
            tvKdRatio.setText("K/D Ratio: " + player.getKdRatio());
            tvDiamonds.setText("Diamonds: " + player.getDiamonds());
            tvHeadshots.setText("Headshots: " + (player.getKills() / 7));
            tvAccuracy.setText("Accuracy: 67%");

            pbLevel.setProgress(player.getLevel() * 2);
            pbKills.setProgress((int) (player.getKdRatio() * 15));
        }

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}