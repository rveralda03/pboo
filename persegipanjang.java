public class persegipanjang implements Abstrak{
    private double p,l;

    double getP()
    {
        return this.p;
    }

    void setP(double p)
    {
        this.p = p;
    }

    double getL()
    {
        return this.l;
    }

    void setL(double l)
    {
        this.l = l;
    }

    public double cariluas()
    {
        return this.p*this.l;
    }
}
