package exception.custom;

public class NotFromAException extends RuntimeException {

    private String nm;

    public NotFromAException(String nm) {
        this.nm = nm;
    }

    @Override
    public String getMessage() {
        return  " Your supplied name is not starting from a or A";
    }

    @Override
    public String toString() {
        return super.toString() + nm;
    }
}
