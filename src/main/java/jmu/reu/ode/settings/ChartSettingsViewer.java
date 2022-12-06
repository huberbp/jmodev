package jmu.reu.ode.settings;

import java.util.List;
import java.awt.GridLayout;

import javax.swing.JPanel;

import jmu.reu.ode.view.ODEView;

/**
 * This class allows us to create as many ChartSettingsPanels as we need in the same order and 
 * layout as the actual ODEView.
 * 
 * @author Benjamin Huber
 * @version 11/4/2022
 */
public class ChartSettingsViewer extends JPanel {
    public ChartSettingsViewer(ODEView parent, List<ChartSettings> cSettingsList) {
        super();

        int n = (int)(Math.sqrt((double)cSettingsList.size())+0.5);

        this.setLayout(new GridLayout(n, n, 2, 2));
        
        for (ChartSettings settings : cSettingsList) {
            ChartSettingsPanel panel;
            if (settings.getXAxis() == null) {
                panel = new ChartSettingsPanel(parent, null);
            } else {
                panel = new ChartSettingsPanel(parent, settings);
            }
            this.add(panel);
        }
    }
}
