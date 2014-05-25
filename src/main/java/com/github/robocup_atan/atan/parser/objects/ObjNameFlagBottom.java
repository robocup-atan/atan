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
 * The parser object for the bottom flags.
 *
 * @author Atan
 */
public class ObjNameFlagBottom implements ObjName {
    int  number;
    char qualifier;

    /**
     * A constructor for bottom flags.
     *
     * @param qualifier Either 'l' or 'r'.
     * @param number Either 10, 20, 30, 40 or 50.
     */
    public ObjNameFlagBottom(char qualifier, int number) {
        this.qualifier = qualifier;
        this.number    = number;
    }

    /** {@inheritDoc} */
    @Override
    public void infoSeeFromEast(ControllerPlayer c, double distance, double direction, double distChange,
                                double dirChange, double bodyFacingDirection, double headFacingDirection) {
        switch (qualifier) {
            case 'l' :
                switch (number) {
                    case 50 :
                        c.infoSeeFlagLeft(Flag.OTHER_50, distance, direction, distChange, dirChange,
                                          bodyFacingDirection, headFacingDirection);
                        break;
                    case 40 :
                        c.infoSeeFlagLeft(Flag.OTHER_40, distance, direction, distChange, dirChange,
                                          bodyFacingDirection, headFacingDirection);
                        break;
                    case 30 :
                        c.infoSeeFlagLeft(Flag.OTHER_30, distance, direction, distChange, dirChange,
                                          bodyFacingDirection, headFacingDirection);
                        break;
                    case 20 :
                        c.infoSeeFlagLeft(Flag.OTHER_20, distance, direction, distChange, dirChange,
                                          bodyFacingDirection, headFacingDirection);
                        break;
                    case 10 :
                        c.infoSeeFlagLeft(Flag.OTHER_10, distance, direction, distChange, dirChange,
                                          bodyFacingDirection, headFacingDirection);
                        break;
                }
                ;
                break;
            case 'r' :
                switch (number) {
                    case 50 :
                        c.infoSeeFlagLeft(Flag.OWN_50, distance, direction, distChange, dirChange, bodyFacingDirection,
                                          headFacingDirection);
                        break;
                    case 40 :
                        c.infoSeeFlagLeft(Flag.OWN_40, distance, direction, distChange, dirChange, bodyFacingDirection,
                                          headFacingDirection);
                        break;
                    case 30 :
                        c.infoSeeFlagLeft(Flag.OWN_30, distance, direction, distChange, dirChange, bodyFacingDirection,
                                          headFacingDirection);
                        break;
                    case 20 :
                        c.infoSeeFlagLeft(Flag.OWN_20, distance, direction, distChange, dirChange, bodyFacingDirection,
                                          headFacingDirection);
                        break;
                    case 10 :
                        c.infoSeeFlagLeft(Flag.OWN_10, distance, direction, distChange, dirChange, bodyFacingDirection,
                                          headFacingDirection);
                        break;
                }
                ;
                break;
            case '0' :
                c.infoSeeFlagLeft(Flag.CENTER, distance, direction, distChange, dirChange, bodyFacingDirection,
                                  headFacingDirection);
                break;
        }
    }

    /** {@inheritDoc} */
    @Override
    public void infoSeeFromWest(ControllerPlayer c, double distance, double direction, double distChange,
                                double dirChange, double bodyFacingDirection, double headFacingDirection) {
        switch (qualifier) {
            case 'l' :
                switch (number) {
                    case 50 :
                        c.infoSeeFlagRight(Flag.OWN_50, distance, direction, distChange, dirChange,
                                           bodyFacingDirection, headFacingDirection);
                        break;
                    case 40 :
                        c.infoSeeFlagRight(Flag.OWN_40, distance, direction, distChange, dirChange,
                                           bodyFacingDirection, headFacingDirection);
                        break;
                    case 30 :
                        c.infoSeeFlagRight(Flag.OWN_30, distance, direction, distChange, dirChange,
                                           bodyFacingDirection, headFacingDirection);
                        break;
                    case 20 :
                        c.infoSeeFlagRight(Flag.OWN_20, distance, direction, distChange, dirChange,
                                           bodyFacingDirection, headFacingDirection);
                        break;
                    case 10 :
                        c.infoSeeFlagRight(Flag.OWN_10, distance, direction, distChange, dirChange,
                                           bodyFacingDirection, headFacingDirection);
                        break;
                }
                ;
                break;
            case 'r' :
                switch (number) {
                    case 50 :
                        c.infoSeeFlagRight(Flag.OTHER_50, distance, direction, distChange, dirChange,
                                           bodyFacingDirection, headFacingDirection);
                        break;
                    case 40 :
                        c.infoSeeFlagRight(Flag.OTHER_40, distance, direction, distChange, dirChange,
                                           bodyFacingDirection, headFacingDirection);
                        break;
                    case 30 :
                        c.infoSeeFlagRight(Flag.OTHER_30, distance, direction, distChange, dirChange,
                                           bodyFacingDirection, headFacingDirection);
                        break;
                    case 20 :
                        c.infoSeeFlagRight(Flag.OTHER_20, distance, direction, distChange, dirChange,
                                           bodyFacingDirection, headFacingDirection);
                        break;
                    case 10 :
                        c.infoSeeFlagRight(Flag.OTHER_10, distance, direction, distChange, dirChange,
                                           bodyFacingDirection, headFacingDirection);
                        break;
                }
                ;
                break;
            case '0' :
                c.infoSeeFlagRight(Flag.CENTER, distance, direction, distChange, dirChange, bodyFacingDirection,
                                   headFacingDirection);
                break;
        }
    }

    /** {@inheritDoc} */
    @Override
    public void infoSeeFromEast(ControllerCoach c, double x, double y, double deltaX, double deltaY, double bodyAngle,
                                double neckAngle) {
        throw new UnsupportedOperationException();
    }

    /** {@inheritDoc} */
    @Override
    public void infoSeeFromWest(ControllerCoach c, double x, double y, double deltaX, double deltaY, double bodyAngle,
                                double neckAngle) {
        throw new UnsupportedOperationException();
    }

    /** {@inheritDoc} */
    @Override
    public void infoSee(ControllerTrainer c) {
        throw new UnsupportedOperationException();
    }
}
