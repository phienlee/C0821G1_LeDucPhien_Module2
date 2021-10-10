package review_oop.ex_1;

public class Vehicle {
    private int cylinder;
    private int moneyCar;

    public int getMoneyCar() {
        return moneyCar;
    }

    public void setMoneyCar(int moneyCar) {
        this.moneyCar = moneyCar;
    }

    public int getCylinder() {
        return cylinder;
    }

    public void setCylinder(int cylinder) {

        this.cylinder = cylinder;
    }

    public Vehicle() {

    }

    public Vehicle(int cylinder, int moneyCar) {
        this.cylinder = cylinder;
        this.moneyCar = moneyCar;
    }

    public int tax(int cylinder) {
        if (cylinder < 100) {
            return moneyCar / 100;
        } else if (cylinder > 100 && cylinder < 200) {
            return moneyCar * 3 / 100;
        } else {
            return moneyCar * 5 / 100;
        }
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "cylinder=" + cylinder +
                ", moneyCar=" + moneyCar +
                '}';
    }
}
