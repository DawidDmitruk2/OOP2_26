public class Main2 {
    public static void main(String[] args) {
        //wielokaty------------------
        Point[] vertices = new Point[4];
        Point v1 = new Point(10, 10);
        vertices[0] = v1;
        vertices[1] = new Point(50, 50);
        Point v3 = new Point(70, 10);
        vertices[2] = v3;
        vertices[3] = new Point(10, 70);

        Polygon poly = new Polygon(vertices);
        System.out.println(poly);
        System.out.println(poly.toSVG());

    }
}
