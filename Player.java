package com.freefire.dashboard;

import java.io.Serializable;

public class Player implements Serializable {
    private String name;
    private int level;
    private int kills;
    private int wins;
    private double kdRatio;
    private String rank;
    private int diamonds;

    public Player(String name, int level, int kills, int wins, double kdRatio, String rank, int diamonds) {
        this.name = name;
        this.level = level;
        this.kills = kills;
        this.wins = wins;
        this.kdRatio = kdRatio;
        this.rank = rank;
        this.diamonds = diamonds;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getLevel() { return level; }
    public void setLevel(int level) { this.level = level; }

    public int getKills() { return kills; }
    public void setKills(int kills) { this.kills = kills; }

    public int getWins() { return wins; }
    public void setWins(int wins) { this.wins = wins; }

    public double getKdRatio() { return kdRatio; }
    public void setKdRatio(double kdRatio) { this.kdRatio = kdRatio; }

    public String getRank() { return rank; }
    public void setRank(String rank) { this.rank = rank; }

    public int getDiamonds() { return diamonds; }
    public void setDiamonds(int diamonds) { this.diamonds = diamonds; }
}