public class Slizerin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    @Override
    public String toString() {
        return "Slizerin{" +
                getName() + " " +
                ", powerMagic=" + getPowerMagic() +
                ", rangeTrancgressiv=" + getRangeTrancgressiv() +
                ", cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower +
                '}';
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }



    public Slizerin(String name,int powerMagic, int rangeTrancgressiv, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, powerMagic, rangeTrancgressiv);
        if (cunning < 0 || cunning >100) throw new IllegalArgumentException("out range");
            this.cunning = cunning;
        if (determination < 0 || determination >100) throw new IllegalArgumentException("out range");
            this.determination = determination;
        if (ambition < 0 || ambition >100) throw new IllegalArgumentException("out range");
            this.ambition = ambition;
        if (resourcefulness < 0 || resourcefulness >100) throw new IllegalArgumentException("out range");
            this.resourcefulness = resourcefulness;
        if (lustForPower < 0 || lustForPower >100) throw new IllegalArgumentException("out range");
            this.lustForPower = lustForPower;
    }
}
