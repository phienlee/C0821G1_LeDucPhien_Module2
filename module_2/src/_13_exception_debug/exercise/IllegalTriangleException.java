package _13_exception_debug.exercise;

public class IllegalTriangleException extends  Exception{
    public IllegalTriangleException(String message) {
        super(message);
    }

    public String getMessage(){
        return "Error input length of triangle's edge: " + super.getMessage();
    }
}
