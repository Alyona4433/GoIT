public class OtherShape extends Shape {
    private String name;

    public OtherShape(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
