package com.github.robocup_atan.atan.parser.objects;

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

//~--- non-JDK imports --------------------------------------------------------

import com.github.robocup_atan.atan.model.ControllerCoach;
import com.github.robocup_atan.atan.model.ControllerPlayer;
import com.github.robocup_atan.atan.model.ControllerTrainer;
import com.github.robocup_atan.atan.model.enums.Flag;

/**
 * The parser object for goal right.
 *
 * @author Atan
 */
public class ObjNameFlagGoalRight implements ObjName {
    char qualifier;

    /**
     * A constructor for goal right.
     *
     * @param qualifier Either 't' or 'b'.
     */
    public ObjNameFlagGoalRight(char qualifier) {
        this.qualifier = qualifier;
    }

    /** {@inheritDoc} */
    @Override
    public void infoSeeFromEast(ControllerPlayer c, double distance, double direction, double distChange,
                                double dirChange, double bodyFacingDirection, double headFacingDirection) {
        switch (qualifier) {
            case 't' :
                c.infoSeeFlagGoalOwn(Flag.RIGHT, distance, direction, distChange, dirChange, bodyFacingDirection,
                                     headFacingDirection);
                break;
            case 'b' :
                c.infoSeeFlagGoalOwn(Flag.LEFT, distance, direction, distChange, dirChange, bodyFacingDirection,
                                     headFacingDirection);
                break;
            default :
                c.infoSeeFlagGoalOwn(Flag.CENTER, distance, direction, distChange, dirChange, bodyFacingDirection,
                                     headFacingDirection);
                break;
        }
    }

    /** {@inheritDoc} */
    @Override
    public void infoSeeFromWest(ControllerPlayer c, double distance, double direction, double distChange,
                                double dirChange, double bodyFacingDirection, double headFacingDirection) {
        switch (qualifier) {
            case 't' :
                c.infoSeeFlagGoalOther(Flag.LEFT, distance, direction, distChange, dirChange, bodyFacingDirection,
                                       headFacingDirection);
                break;
            case 'b' :
                c.infoSeeFlagGoalOther(Flag.RIGHT, distance, direction, distChange, dirChange, bodyFacingDirection,
                                       headFacingDirection);
                break;
            default :
                c.infoSeeFlagGoalOther(Flag.CENTER, distance, direction, distChange, dirChange, bodyFacingDirection,
                                       headFacingDirection);
                break;
        }
    }

    /** {@inheritDoc} */
    @Override
    public void infoSeeFromEast(ControllerCoach c, double x, double y, double deltaX, double deltaY, double bodyAngle,
                                double neckAngle) {
        c.infoSeeGoalOwn(x, y);
    }

    /** {@inheritDoc} */
    @Override
    public void infoSeeFromWest(ControllerCoach c, double x, double y, double deltaX, double deltaY, double bodyAngle,
                                double neckAngle) {
        c.infoSeeGoalOther(x, y);
    }

    /** {@inheritDoc} */
    @Override
    public void infoSee(ControllerTrainer c) {

        // TODO Auto-generated method stub
    }
}
