package ua.lesson14;

public class InvalidInputDataException extends MainServiceException{

    private static final String CODE = "1";
    private static final String NAME = "Input Data is invalid : ";

    public InvalidInputDataException(String message) {
        super(CODE,message);
    }

}
