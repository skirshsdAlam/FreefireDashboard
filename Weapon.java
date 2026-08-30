package com.freefire.dashboard;

public class Weapon {
    private String name;
    private String type;
    private String description;
    private String damage;

    public Weapon(String name, String type, String description, String damage) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.damage = damage;
    }

    public String getName() { return name; }
    public String getType() { return type; }
    public String getDescription() { return description; }
    public String getDamage() { return damage; }
}