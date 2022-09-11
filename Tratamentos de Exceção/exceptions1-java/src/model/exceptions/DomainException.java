package model.exceptions;

public class DomainException extends RuntimeException{
    private static final long serialVersionVID = 1L;

    public DomainException(String msg) {
        super(msg);
    }
}
