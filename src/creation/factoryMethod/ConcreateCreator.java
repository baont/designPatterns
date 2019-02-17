package creation.factoryMethod;

public class ConcreateCreator implements Creator {
    @Override
    public Product createProduct() {
        return new ConcreateProduct();
    }
}
