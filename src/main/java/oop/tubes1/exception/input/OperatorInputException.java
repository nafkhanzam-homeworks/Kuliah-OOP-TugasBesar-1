package oop.tubes1.exception.input;

/**
 * InvalidNegativeException
 */
public class OperatorInputException extends InputException {

    private static final long serialVersionUID = -8618017033170028681L;

    public OperatorInputException(String expression) {
        super("The operator is invalid! Found on: " + expression);
    }

}