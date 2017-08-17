package com.ps.ramsey.algo;

import com.ps.ramsey.model.Input;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 *
 */
public class SolverTest {


    @Test
    public void solutionTest1() {

        Input input = Input.parse(SolverTest.class.getClassLoader().getResourceAsStream("input-1"));

        Solver solver = new DPSolutionProvider();

        int maxSatisfaction = solver.solve(input);

        assertThat(maxSatisfaction, is(equalTo(3)));

    }


    @Test
    public void solutionTest2() {

        Input input = Input.parse(SolverTest.class.getClassLoader().getResourceAsStream("input-2"));

        Solver solver = new DPSolutionProvider();

        int maxSatisfaction = solver.solve(input);

        assertThat(maxSatisfaction, is(equalTo(18)));

    }


    @Test
    public void solutionTest3() {

        Input input = Input.parse(SolverTest.class.getClassLoader().getResourceAsStream("input-3"));

        Solver solver = new DPSolutionProvider();

        int maxSatisfaction = solver.solve(input);

        assertThat(maxSatisfaction, is(equalTo(15)));

    }


    @Test
    public void solutionTest4() {

        Input input = Input.parse(SolverTest.class.getClassLoader().getResourceAsStream("input-4"));

        Solver solver = new DPSolutionProvider();

        int maxSatisfaction = solver.solve(input);

        assertThat(maxSatisfaction, is(equalTo(37)));

    }







}
