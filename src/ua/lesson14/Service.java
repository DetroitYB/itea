package ua.lesson14;


public class Service {

    public String getResult(InputData inputData) {
        if (inputData.getId() == null) {
            throw new InvalidInputDataException("Id is null");
        }
        try {
            inputData.getName().toLowerCase();
        }catch (NullPointerException e ){
            System.out.println( "NullPointerException inputData.getName()" );
            throw  new InternalAdapterError("NullPointerException inputData.getName()");
        }
        return "OK";
    }
}
