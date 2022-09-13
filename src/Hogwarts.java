public class Hogwarts {
    private String name;
    private int powerMagic;
    private int rangeTrancgressiv;

    public int getPowerMagic() {
        return powerMagic;
    }

    public void setPowerMagic(int powerMagic) {
        this.powerMagic = powerMagic;
    }

    public int getRangeTrancgressiv() {
        return rangeTrancgressiv;
    }

    public void setRangeTrancgressiv(int rangeTrancgressiv) {
        this.rangeTrancgressiv = rangeTrancgressiv;
    }

    public Hogwarts(String name, int powerMagic, int rangeTrancgressiv) {
        this.name = name;
        if (powerMagic < 0 || powerMagic >100) throw new IllegalArgumentException("out range");
            this.powerMagic = powerMagic;
        if (rangeTrancgressiv < 0 || rangeTrancgressiv > 100) throw new IllegalArgumentException("out range");
            this.rangeTrancgressiv = rangeTrancgressiv;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name +
                ", powerMagic=" + powerMagic +
                ", rangeTrancgressiv=" + rangeTrancgressiv +
                '}';
    }
}
