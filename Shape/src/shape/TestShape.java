package shape;

/**
 *
 * @author luffy
 */
public class TestShape {
    public static void main(String[] args) {
        Shape[] shapes=new Shape[4];
        shapes[0]=new Circle("Green",10);
        shapes[1]=new Circle("Blue",5);
        shapes[2]=new Rectangle("Green",10,5);
        shapes[3]=new Rectangle("Green",10,20);
        
        
        new Rectangle("Green",10,5);
        new Rectangle("Green",10,5);
        
        
        for(int i=0;i<shapes.length;i++){
            System.out.println(shapes[i].toString());
        }
    }    
}
