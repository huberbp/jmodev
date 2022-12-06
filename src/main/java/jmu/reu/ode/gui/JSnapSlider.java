package jmu.reu.ode.gui;

import javax.swing.JSlider;

/**
 * A class that encapsulates a slider that "snaps" to its point.  This will allow us to force 
 * certain values for sliders where it would make sense (precision to increments of 16, etc.).
 * 
 * @author Benjamin Huber
 * @version 7/9/2022
 */
public class JSnapSlider extends JSlider {
    public JSnapSlider (int min, int max, int value, int snap) {
        super(min, max, value);
        setPaintTicks(true);
        setMajorTickSpacing(snap);
        setSnapToTicks(true);
    }
}