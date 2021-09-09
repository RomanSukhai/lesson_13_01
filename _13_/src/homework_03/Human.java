package homework_03;

public class Human {

    private int low;
    private int growth;

    public Human(int low, int growth) {
        this.low = low;
        this.growth = growth;
    }

    public int getLow() {
        return low;
    }

    public void setLow(int low) {
        this.low = low;
    }

    public int getGrowth() {
        return growth;
    }

    public void setGrowth(int growth) {
        this.growth = growth;
    }

    @Override
    public String toString() {
        return "Human{" +
                "low=" + low +
                ", growth=" + growth +
                '}';
    }
}
