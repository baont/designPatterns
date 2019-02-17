package beharvioral.chainOfResponsibility;

public abstract class Logger {
    public static final int ERR = 3;
    public static final int NOTICE = 5;
    public static final int DEBUG = 7;

    private Logger next;
    private final int mask;

    public Logger(int mask) {
        this.mask = mask;
    }

    public Logger setNext(Logger logger) {
        this.next = logger;
        return next;
    }

    public void message(String mesasge, int priority) {
        if (priority <= mask) {
            writeMessage(mesasge);
        }
        if (next != null) {
            next.message(mesasge, priority);
        }
    }

    public abstract void writeMessage(String mess);
}
