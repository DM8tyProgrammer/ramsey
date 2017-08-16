package com.ps.ramsey.model;

import com.ps.ramsey.exception.ParseException;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Represents input data
 *
 */
public class Input {

    private int totalTime;
    private List<Item> items;


    public int getTotalTime() {
        return totalTime;
    }


    public List<Item> getItems() {
        return items;
    }

    private void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }
    private void setItems(List<Item> items) {
        this.items = items;
    }

    /**
     * Parse the steam to {@link Input}
     * @param stream Input stream
     * @return Input on parse
     * @throws ParseException if there is error in parsing
     */
    public static Input parse(InputStream stream) {

        try {
            Scanner scanner = new Scanner(stream);

            Input input = new Input();
            input.setTotalTime(scanner.nextInt());

            int n = scanner.nextInt();

            List<Item> items = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                items.add(new Item(scanner.nextInt(), scanner.nextInt()));
            }

            input.setItems(items);

            return input;

        } catch (Exception e) {
            throw new ParseException("unable to parse the stream", e);
        }
    }
}
