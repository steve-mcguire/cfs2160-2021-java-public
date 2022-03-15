package exceptionexample;

public class InputErrorException extends Exception{
    public InputErrorException(String message) {
        super(message);
    }
}
