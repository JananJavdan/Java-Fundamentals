package Les3;

public class Rectangle {
     public int height;
     public int width;
     public int x;
     public int y;


    public Rectangle(int height, int width, int x, int y) {
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y;
    }
    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    public Rectangle(Rectangle rectangel){
        this.height = rectangel.height;
        this.width = rectangel.width;
        this.x = rectangel.x;
        this.y = rectangel.y;
    }
    public Rectangle(){}


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }
    public int getWidth(){
        return width;
    }
    public void setWidth(int width){
        this.width = width < 0 ? -width : width;}


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height < 0 ? -height : height;}



    public void setPositioin(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getArea(){
        return  height*width;
    }
    public  int getPerimeter(){
        return (width+height) * 2;
    }
    public void grow(int d){
        this.height = this.height + Math.abs(d);
        this.width = this.width + Math.abs(d);
    }
}
