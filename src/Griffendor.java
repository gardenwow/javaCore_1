public class Griffendor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Griffendor(String name, int powerMagic, int rangeTrancgressiv, int nobility, int honor, int bravery) {
        super(name, powerMagic, rangeTrancgressiv);
        if (nobility < 0 || nobility >100) throw new IllegalArgumentException("out range");
            this.nobility = nobility;
        if (honor < 0 || honor >100) throw new IllegalArgumentException("out range");
            this.honor = honor;
        if (bravery < 0 || bravery >100) throw new IllegalArgumentException("out range");
            this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Griffendor{" +
                getName() + " " +
                ", powerMagic=" + getPowerMagic() +
                ", rangeTrancgressiv=" + getRangeTrancgressiv() +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }
}
