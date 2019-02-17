package creation.builder;

public class Door {
    private int w;
    private int h;
    private int color;

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Door{" +
                "w=" + w +
                ", h=" + h +
                ", color=" + color +
                '}';
    }
}
