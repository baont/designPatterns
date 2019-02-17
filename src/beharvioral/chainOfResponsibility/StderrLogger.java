package beharvioral.chainOfResponsibility;

public class StderrLogger extends Logger {
    public StderrLogger(int mask) {
        super(mask);
    }

    @Override
    public void writeMessage(String mess) {
        System.out.println("write " + mess + " to stderr");
    }
}
