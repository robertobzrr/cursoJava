package exercicios.ex_sec08.ex01.entities;

public class Rectangle {

    public double width;
    public double height;


    public double areaRectangle(){
        return width*height;
    }

    public double perimeterRectangle(){
        return 2*(width+height);
    }

    public double diagonalRectangle(){
        return Math.sqrt((width*width)+(height*height));
    }


}
