package com.github.robocup_atan.atan.parser.trainer;

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

import com.github.robocup_atan.atan.model.ActionsPlayer;
import com.github.robocup_atan.atan.model.ActionsTrainer;
import com.github.robocup_atan.atan.model.enums.PlayMode;

public class BaseActionsTrainer implements ActionsTrainer {

    public void changePlayMode(PlayMode playMode) {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void movePlayer(ActionsPlayer p, double x, double y) {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void moveBall(double x, double y) {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void checkBall() {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void startGame() {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void recover() {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void eye(boolean eyeOn) {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void ear(boolean earOn) {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void say(String message) {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void changePlayerType(String teamName, int unum, int playerType) {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void look() {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void teamNames() {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void bye() {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void handleError(String error) {
        throw new UnsupportedOperationException("Not supported in this test.");
    }
}
