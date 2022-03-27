package core.basesyntax.model;

import java.text.DecimalFormat;

public class IsoscelesTrapezoid extends Figure implements AreaCalculator {
    private int upperBase;
    private int lowerBase;
    private int height;
    private DecimalFormat decimalFormat = new DecimalFormat("0.0");

    public IsoscelesTrapezoid(int upperBase, int lowerBase, int height, String color) {
        super(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return Double.parseDouble(decimalFormat.format((upperBase + lowerBase) / 2 * height));
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Figure: isosceles trapezoid, area: ").append(getArea())
                .append(" sq.units, upper base: ").append(upperBase)
                .append(" units, lower base: ").append(lowerBase)
                .append(" units, height: ").append(height)
                .append(" units, color: ").append(getColor()).toString();
    }
}