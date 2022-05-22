
 public class TestMyRectangle{
        public static void main(String[] args){
            MyRectangle2D rect = new MyRectangle2D(2,2,5.5,4.9);
            
            System.out.println("Area is "+rect.getArea());
            System.out.println("Perimeter is "+rect.getPerimeter());
            System.out.println("Contains (3,3) "+rect.contains(3,3));
            System.out.println("Contains (4,5,10.5,3.2) "+rect.contains(new MyRectangle2D(4,6,10.5,3.2)));
            System.out.println("Overlaps "+rect.overlaps(new MyRectangle2D(3,5,2.3,6.7)));
          }
    }
