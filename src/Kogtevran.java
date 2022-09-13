public class Kogtevran extends Hogwarts{
    private int smart;
    private int wise;
    private int witty;
    private int creativy;

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreativy() {
        return creativy;
    }

    public void setCreativy(int creativy) {
        this.creativy = creativy;
    }

    @Override
    public String toString() {
        return "Kogtevran{" +
                getName() + " " +
                ", powerMagic=" + getPowerMagic() +
                ", rangeTrancgressiv=" + getRangeTrancgressiv() +
                ", smart=" + smart +
                ", wise=" + wise +
                ", witty=" + witty +
                ", creativy=" + creativy +
                '}';
    }

    public Kogtevran(String name, int powerMagic, int rangeTrancgressiv, int smart, int wise, int witty, int creativy) {
        super(name, powerMagic, rangeTrancgressiv);
        if (smart < 0 || smart >100) throw new IllegalArgumentException("out range");
            this.smart = smart;
        if (wise < 0 || wise >100) throw new IllegalArgumentException("out range");
            this.wise = wise;
        if (witty < 0 || witty >100) throw new IllegalArgumentException("out range");
            this.witty = witty;
        if (creativy < 0 || creativy >100) throw new IllegalArgumentException("out range");
            this.creativy = creativy;
    }
}
