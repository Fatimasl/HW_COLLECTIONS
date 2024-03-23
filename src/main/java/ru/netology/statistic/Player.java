package ru.netology.statistic;

public class Player implements Comparable<Player> {
    String id;
    String name;
    int strength;

    public Player(String id, String name, int strength) {
        this.id = id;
        this.name = name;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Player o) {
        if (this.strength > o.strength) {
            return 1;
        } else if (this.strength < o.strength) {
            return -1;
        } else {
            return 0;
        }

    }
}
