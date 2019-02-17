package beharvioral.chainOfResponsibility;

public class StdoutLogger extends Logger {
    public StdoutLogger(int mask) {
        super(mask);
    }

    @Override
    public void writeMessage(String mess) {
        System.out.println("write " + mess + " to stdout");
    }
}
