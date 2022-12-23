public class segitiga implements Abstrak {
    private double a, t;

    double getA()
    {
        return this.a;
    }

    void setA(double a)
    {
        this.a = a;
    }

    double getT()
    {
        return this.t;
    }

    void setT(double t)
    {
        this.t = t;
    }

    public double cariluas()
    {
        return this.t*this.a*0.5;
    }
}
