package beharvioral.templateMethod;

public class CplussBuilder extends Builder {
    @Override
    protected void deploy() {
        System.out.println("C++ deploy");
    }

    @Override
    protected void test() {
        System.out.println("C++ test");
    }

    @Override
    protected void link() {
        System.out.println("C++ link");
    }

    @Override
    protected void compile() {
        System.out.println("C++ compile");
    }
}
