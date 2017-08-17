package com.ps.ramsey.input;

/**
 * Represents Item
 */
public class Item {

    private int satisfaction;
    private int time;

    Item(int satisfaction, int time) {
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
