package ro.sda.fundamentals._6_Classes.part_7;
// Write a class with the name Floor. The class needs two fields (instance variables) with name width and length of type double.
//        The class needs to have one constructor with parameters width and height of type double and it needs to initialize the fields.
//        In case the width parameter is less than 0 it needs to set the width field value to 0,
//       in case the length parameter is less than 0 it needs to set the length field value to 0.
//       Write the following methods (instance methods):
//       * Method named getArea without any parameters, it needs to return the calculated area (width * length).

public class Floor {
    private double width;
    private double length;

    public Floor() {
        // Using the below syntax we call the constructor with parameters passing some default parameters

        this(1, 1);

    }

    public Floor(double width, double length) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return this.width * this.length;
    }
}
