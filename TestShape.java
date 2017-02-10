
package shape;
public class TestShape {
    public static void main(String[] args) {
        Shape[] objShape = new Shape[7] ;
        objShape[0] = new Circle("red",5);
        objShape[1] = new Circle("red",7);
        objShape[2] = new Circle("red",6);
        objShape[3] = new Rectangle("blue",4,5);
        objShape[4] = new Rectangle("blue",4,4);
        objShape[5] = new Rectangle("blue",4,6);
       
        
        Resizeable[] objResizeable = new Resizeable[3];
        objResizeable[0] = new Circle("red",5);
        objResizeable[1] = new Rectangle("blue",4,5);
        objResizeable[2] = new Image(10, 20);
        for(int i=0;i<objResizeable.length;i++){
            objResizeable[i].enlarge(50);
            
        }
        for(int i=0;i<objResizeable.length;i++){
            System.out.println(objResizeable[i].toString());
            System.out.println("=================");
        }
        
        //objShape[0].enlarge(50);
        //for(int i = 0;i<6;i++){
        //System.out.println((1+i)+". "+objShape[i].toString());
        //System.out.println("===============");
    }
    }

