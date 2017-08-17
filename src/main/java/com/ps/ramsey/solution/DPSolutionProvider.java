package com.ps.ramsey.solution;

import com.ps.ramsey.input.Input;
import com.ps.ramsey.input.Item;
import org.springframework.stereotype.Component;

/**
 * Solves the problem using Dynamic Programming
 */
@Component
class DPSolutionProvider implements Solver {


    @Override
    public int solve(Input input) {

        assert(input.getItems()!= null && input.getItems().size() > 0);

        // satisfaction table :: st[i][j] : maximum satisfaction when time <= j and first i items are considered

        int [][] st = new int[input.getItems().size()][input.getTotalTime()+1];


        // initialize the table for first row
        Item firstItem = input.getItems().get(0);

        for (int t = 0; t <= input.getTotalTime(); t++) {

            st[0][t] = firstItem.getTime() <= t ?  firstItem.getSatisfaction(): 0;

        }


        // rest
        for(int i = 1; i < input.getItems().size(); i++) {

            // current item
            Item curItem = input.getItems().get(i);

            for (int t = 0; t <= input.getTotalTime(); t++) {

                 // consider the item ?
                 if (t >= curItem.getTime()) {

                     // check item add value to satisfaction ?
                     st[i][t] = Math.max(st[i - 1][t], curItem.getSatisfaction() + st[i-1][t - curItem.getTime()]);

                 } else {

                     st[i][t] = st[i - 1][t];
                 }


            }

        }


        return st[input.getItems().size() - 1][input.getTotalTime()];


    }
}
