package EXAMPLES.ExceptionExample;

//custom class for exception
public class InputErrorException extends Exception{
    public InputErrorException(String message) {
        super(message);
    }
}
