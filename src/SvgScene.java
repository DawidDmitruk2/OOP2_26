public class SvgScene {
    private Polygon[] polygons;
    private int i; //index pod ktory wstawic kolejny obiekt
    public SvgScene() {
        polygons = new Polygon[3];
    }

    public void addPolygon(Polygon poly) {
        polygons[i] = poly;
        i = (i + 1) % 3; // 0 -> 1 -> 2 -> 1 -> 2 ...
    }


}
