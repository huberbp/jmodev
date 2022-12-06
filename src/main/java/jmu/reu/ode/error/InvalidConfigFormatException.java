package jmu.reu.ode.error;

/**
 * A class that encapsulates an exception that is thrown when our config file has some invalid 
 * formatting properties.
 * 
 * @author Benjamin Huber
 * @version 9/2022
 */
public class InvalidConfigFormatException extends RuntimeException {

    public InvalidConfigFormatException (String errorMessage) {
        super(errorMessage);
    }
}
