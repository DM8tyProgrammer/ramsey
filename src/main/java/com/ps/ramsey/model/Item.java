package com.ps.ramsey.model;

/**
 * Represents Item
 */
public class Item {

    private int satisfaction;
    private int time;

    public Item(int satisfaction, int time) {
        this.satisfaction = satisfaction;
        this.time = time;
    }

    public int getSatisfaction() {
        return satisfaction;
    }

    public int getTime() {
        return time;
    }

}
