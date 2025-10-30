public class Rectangle {
    private double width;
    private double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Getter for width
    public double getWidth() {
        return width;
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Method to calculate area
    public double getArea() {
        return width * height;
    }

    // Method to calculate diagonal using Pythagoras theorem
    public double getDiagonal() {
        return Math.sqrt(width * width + height * height);
    }
}
