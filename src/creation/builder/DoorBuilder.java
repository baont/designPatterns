package creation.builder;

public class DoorBuilder {
    private int w;
    private int h;
    private int color;

    public DoorBuilder w(int w) {
        this.w = w;
        return this;
    }

    public DoorBuilder h(int h) {
        this.h = h;
        return this;
    }

    public DoorBuilder color(int color) {
        this.color = color;
        return this;
    }

    public Door build() {
        Door door = new Door();
        door.setW(w);
        door.setH(h);
        door.setColor(color);
        return door;
    }
}
