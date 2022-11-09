package exercise;

public class Square {
    private
    Integer sideLength;

    public Square(Integer sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public String toString() {
        return "Square{" +
                "sideLength=" + sideLength +
                '}';
    }
}
