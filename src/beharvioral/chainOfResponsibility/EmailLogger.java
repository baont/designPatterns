package beharvioral.chainOfResponsibility;

public class EmailLogger extends Logger {
    public EmailLogger(int mask) {
        super(mask);
    }

    @Override
    public void writeMessage(String mess) {
        System.out.println("write " + mess + " to email");
    }
}
