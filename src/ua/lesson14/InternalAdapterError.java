package ua.lesson14;

public class InternalAdapterError extends MainServiceException {

    private static final String CODE = "2";
    private static final String NAME = "Internal Adapter Error : ";

    public InternalAdapterError(String message) {
        super(CODE, getErrorMessage(message));
    }

    public static String getErrorMessage(String message){
        StringBuilder sb = new StringBuilder(NAME);
        sb.append(message);
        return sb.toString();
    }
}
