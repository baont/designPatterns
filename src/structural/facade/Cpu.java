package structural.facade;

public class Cpu {
    public void freeze() {
        System.out.println("CPU freeze");
    }

    public void jump(long position) {
        System.out.println("CPU jump to " + position);
    }

    public void excute() {
        System.out.println("CPU excute");
    }
}
