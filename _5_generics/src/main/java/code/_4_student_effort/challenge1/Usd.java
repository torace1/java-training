package code._4_student_effort.challenge1;

public class Usd extends  Currency{

    public Usd() {
    }

    public Usd(double units) {
        super(units);
    }

    public double dollars() {
        return super.getUnits();
    }

    @Override
    public String toString() {
        return dollars() + " dolari";
    }
}
