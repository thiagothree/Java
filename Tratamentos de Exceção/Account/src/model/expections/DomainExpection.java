package model.expections;

public class DomainExpection extends RuntimeException {
    private static final long serialVersionVID = 1L;

    public DomainExpection(String msg) {
        super(msg);
    }
}
