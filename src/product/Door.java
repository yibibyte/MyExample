package product;

public class Door {
    private String model;
    private int size;
    private long id;
    public Door(String model, int size) {
        this.model = model;
        this.size = size;
    }

    public Door(String model, int size, long id) {
        this.model = model;
        this.size = size;
        this.id = id;
    }
}
