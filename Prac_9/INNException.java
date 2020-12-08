package Prac_9;

public class INNException extends RuntimeException  {
    public INNException(Throwable e, String str){
        super(str, e);
    }
}
