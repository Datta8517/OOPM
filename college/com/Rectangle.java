public class Rectangle {


    int Area(int l, int b){

        int c = l*b;

        return c;
    }
    public static void main(String[] args){

        Rectangle R = new Rectangle();
        
        int z = R.Area(4,8);
        int y = R.Area(5,8);

        System.out.println("Area of Rectangle 1 = "+ z + " sq.m\nArea of Rectangle 2 = " + y + " sq.m");
    }
    
}
