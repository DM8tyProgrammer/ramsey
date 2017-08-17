package com.ps.ramsey.input;

import com.ps.ramsey.exception.ParseException;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.InputStream;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

/**
 * Tests the {@link Input#parse(InputStream)}
 */
public class InputParseTest {


    // Positive Case
    @Test
    public void parseTest() throws FileNotFoundException {

        InputStream inputStream = InputParseTest.class.getClassLoader().getResourceAsStream("input");

        Input input = Input.parse(inputStream);

        assertThat(input, is(notNullValue()));
        assertThat(input.getTotalTime(), is(equalTo(5)));

        assertThat(input.getItems(), is(notNullValue()));
        assertThat(input.getItems().size(), is(equalTo(5)));

        assertThat(input.getItems().get(1).getTime(), is(equalTo(15)));
        assertThat(input.getItems().get(3).getSatisfaction(), is(equalTo(100)));
        assertThat(input.getItems().get(3).getSatisfaction(), is(equalTo(100)));

    }


    // Negative Case
    @Test(expected = ParseException.class)
    public void parseFailure() throws FileNotFoundException {

        InputStream inputStream = InputParseTest.class.getClassLoader().getResourceAsStream("parse-exception");

        Input input = Input.parse(inputStream);
    }
}
