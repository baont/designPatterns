package structural.facade;

public class Facade {
    private final Cpu cpu;
    private final HardDrive hardDrive;
    private final Memory memory;

    public Facade() {
        cpu = new Cpu();
        hardDrive = new HardDrive();
        memory = new Memory();
    }

    public void start() {
        cpu.freeze();
        memory.load();
        cpu.jump(100);
        cpu.excute();
    }
}
