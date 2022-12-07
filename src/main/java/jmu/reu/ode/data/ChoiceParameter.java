package jmu.reu.ode.data;

/**
 * This is a type of parameter that allows us to use choices instead of a continuous range of 
 * parameters.
 * 
 * @author Benjamin Huber
 * @version 11/2022
 */
public class ChoiceParameter extends Parameter {
    public String[] options;
    public String selected;
    public ChoiceParameter(String label, String... choices) {
        super(label);
        options = new String[choices.length];
        for (int i = 0; i < choices.length; i++) {
            options[i] = choices[i];
        }
        selected = options[0];
    }
}
