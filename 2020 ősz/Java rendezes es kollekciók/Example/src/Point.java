public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
        System.out.println("két paraméter");
    }

    public Point() {
        this(0.0,0.0);
        System.out.println("nulla paraméter");
    }

    public double tavolsag(){
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
    }

    public double tavolsag(Point p){
        return Math.sqrt(Math.pow(x-p.getX(),2) + Math.pow(y - p.getX(),2));
    }

    public static double tavolsag(Point p, Point s){
        return Math.sqrt(Math.pow(p.getX() - s.getX(),2)
                + Math.pow(p.getY() - s.getY(),2));
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Point)){
            return false;
        }
        Point tmp = (Point)obj;
        return this.tavolsag() == tmp.tavolsag();
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
