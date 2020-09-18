package PandM_SWR;

public abstract class OrbitalObject {
    private double distanceToSun;
    private double circumference;
    private double diameter;

    public OrbitalObject() {
    }

    public OrbitalObject(double distanceToSun, double circumference, double diameter) {
        this.distanceToSun = distanceToSun;
        this.circumference = circumference;
        this.diameter = diameter;
    }

    public double getDistanceToSun() {
        return distanceToSun;
    }

    public void setDistanceToSun(double distanceToSun) {
        this.distanceToSun = distanceToSun;
    }

    public double getCircumference() {
        return circumference;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
}
