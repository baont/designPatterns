package beharvioral.templateMethod;

public abstract class Builder {

    public void build() {
        compile();
        link();
        test();
        deploy();
    }

    protected abstract void deploy();

    protected abstract void test();

    protected abstract void link();

    protected abstract void compile();
}
