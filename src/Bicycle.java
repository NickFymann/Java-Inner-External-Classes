public class Bicycle {
    private double cost;

    public Bicycle(double cost) {
        this.cost = cost;
    }

    double getCost()
    {
        return cost;
    }
    class HandleBar {
        String shape;
        void setupRectaingle()
        {
            shape = "Rectaingle";
        }

        void setupCircled()
        {
            shape = "Circled";
        }

        String  getShape()
        {
            return shape;
        }

    }
}
