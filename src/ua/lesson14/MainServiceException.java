package ua.lesson14;

public class MainServiceException extends RuntimeException{
    private String code;
    private String message = "Misha";

    public MainServiceException(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return this.code;
    }


    @Override
    public String getMessage() {
        StringBuilder sb = new StringBuilder("code : ");
        sb.append(getCode());
        sb.append("; ");
        sb.append(message);
        return sb.toString();
    }
}
