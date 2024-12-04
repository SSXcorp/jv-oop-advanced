package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double side;
    private double upperBase;
    private double lowerBase;

    public IsoscelesTrapezoid(double upperBase,double lowerBase, Color color) {
        super(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
    }

    @Override
    public double calculateArea() {
        return Math.sqrt(Math.pow(side, 2) - Math.pow(((upperBase + lowerBase) / 2), 2));
    }

    @Override
    public String toString() {
        return "Figure: "
                + this.getClass().getSimpleName().toLowerCase() + ", "
                + "area: " + this.calculateArea() + " sq. units, "
                + "side: " + this.side + ", "
                + "upperBase: " + this.upperBase + ", "
                + "lowerBase: " + this.lowerBase + ", "
                + "color: " + getColor().toString();
    }
}
