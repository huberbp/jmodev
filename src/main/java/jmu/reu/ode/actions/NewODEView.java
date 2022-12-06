package jmu.reu.ode.actions;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.AbstractAction;
import javax.swing.JFileChooser;

import jmu.reu.ode.app.ODEViewer;
import jmu.reu.ode.view.ODEView;

/**
 * A class that encapsulates the action of creating a new ODEView.
 * 
 * @author Benjamin Huber
 * @version 6/26/2022
 */
public class NewODEView extends AbstractAction {

    private ODEViewer parent;

    /**
     * The default constructor for a NewODEView action.
     * 
     * @param parent a reference to the calling GUI of this action.
     */
    public NewODEView(ODEViewer parent) {
        this.parent = parent;
        putValue(AbstractAction.NAME, "ODEView");
    }

    /**
     * Essentially, get the user to select a file and then add a new tab to the viewer whenever 
     * this action is performed.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        File file = selectFile();
        
        parent.addNewTab(new ODEView(file));
    }

    /**
     * Prompts the user to select a file, returns null if the file is not found.
     * 
     * @return the file selected, otherwise null.
     */
    private File selectFile() {
        File f;
        JFileChooser dialog = new JFileChooser();
        dialog.setCurrentDirectory(new File(System.getProperty("user.dir")));
        dialog.setFileFilter(new javax.swing.filechooser.FileFilter() {
            public boolean accept(File f) {
                return f.isDirectory() || f.getName().endsWith(".cfg");
            }
            public String getDescription() {
                return "Configurations (*.cfg)";
            }
        });
        int rval = dialog.showOpenDialog(null);
        if (rval == JFileChooser.APPROVE_OPTION) {
            f = dialog.getSelectedFile();
        } else {
            return null;
        }
        return f;
    }

}