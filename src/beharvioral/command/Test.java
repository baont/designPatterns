package beharvioral.command;

public class Test {
    public static void main(String[] args) {
        LightBulk lightBulk = new LightBulk();
        Switch sw = new Switch();
        sw.storeAndExecute(() -> lightBulk.swichOn());

        sw.storeAndExecute(() -> lightBulk.switchOff());
    }
}
