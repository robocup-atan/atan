package com.github.robocup_atan.atan.parser.player;

/*
 * #%L
 * Atan
 * %%
 * Copyright (C) 2003 - 2014 Atan
 * %%
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * #L%
 */

import com.github.robocup_atan.atan.model.enums.PlayMode;
import com.github.robocup_atan.atan.parser.BaseCommandFilter;
import com.github.robocup_atan.atan.parser.Filter;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized;

/**
 * Test class for parsing invalid commands.
 *
 * @author Atan
 */
@RunWith(Parameterized.class)
public class InvalidCommandTest {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {

                /**
                 * The array only contains the following structure.
                 *   0: Server command.
                 */
                {"(invalid command string)"},
                {"(another invalid command string)"},
                {"(invalid_command_without_spaces)"},
            });
    }

    // Global test variables.
    private BaseCommandFilter commandFilter;
    private Filter            filter;

    // Test parameters.
    private String command;

    public InvalidCommandTest(String command) {
        this.command = command;
    }

    @Before
    public void setUpTest() throws Exception {
        commandFilter = new BaseCommandFilter();
        filter        = new Filter();
    }

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void parseCommand() {
        expectedEx.expect(Error.class);
        expectedEx.expectMessage("Invalid command received: \"" + command + "\"");
        filter.run(command, commandFilter);
    }

    // Test logging
    @Rule
    public TestWatcher watchman = new TestWatcher() {

        @Override
        protected void succeeded(Description description) {
            System.out.print("Passed - ");
        }

        @Override
        protected void failed(Throwable e, Description description) {
            System.out.print("FAILED - ");
        }

        @Override
        protected void finished(Description description) {
            System.out.println(command);
        }
    };
}

