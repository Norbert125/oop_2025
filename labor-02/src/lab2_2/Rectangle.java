package lab2_2;

public class Rectangle {
    private double width, length;
    public Rectangle(double length, double width) {
        if(length > 0 && width > 0) {
            this.length = length;
            this.width = width;
        }
    }
    public double getWidth() {
        return width;
    }
    public double getLength() {
        return length;
    }
    public double Area(){
        return width * length;
    }
    public double Perimeter(){
        return (width + length) * 2;
    }
}
