
package shape;


public abstract class Shape {
    private String color;
    public static enum ShapeType{
        Circle,Rectangle
    }
    private ShapeType type;
    private static int count=0;
    
    protected Shape(String color){
        count++;
        this.color=color;        
    }
    public static int count(){        
        return count;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ShapeType getType() {
        return type;
    }

    public void setType(ShapeType type) {
        this.type = type;
    }
    
    public abstract double getArea();
    public abstract double getPerimeter();
    
    public String toString(){
        return type+" color: "+color+" Area:"+getArea()+" Perimeter: "+getPerimeter();
    }

}
