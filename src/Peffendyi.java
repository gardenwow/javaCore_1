public class Peffendyi extends Hogwarts{
    private int hardWorking;
    private int loyal;
    private int honest;

    public Peffendyi(String name, int powerMagic, int rangeTrancgressiv, int hardWorking, int loyal, int honest) {
        super(name, powerMagic, rangeTrancgressiv);
        if (hardWorking < 0 || hardWorking >100) throw new IllegalArgumentException("out range");
            this.hardWorking = hardWorking;
        if (loyal < 0 || loyal >100) throw new IllegalArgumentException("out range");
            this.loyal = loyal;
        if (honest < 0 || honest >100) throw new IllegalArgumentException("out range");
            this.honest = honest;
    }

    @Override
    public String toString() {
        return "Peffendyi{" +
                getName() + " " +
                ", powerMagic=" + getPowerMagic() +
                ", rangeTrancgressiv=" + getRangeTrancgressiv() +
                ", hardWorking=" + hardWorking +
                ", loyal=" + loyal +
                ", honest=" + honest +
                '}';
    }

    public int getHardWorking() {
        return hardWorking;
    }

    public void setHardWorking(int hardWorking) {
        this.hardWorking = hardWorking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }
}
