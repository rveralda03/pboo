public class lingkaran implements Abstrak{ //Objek lingkaran dibuat berdasarkan kelas abstrak (extends) sehingga harus memiliki method cariluas()
    private double r;   //Menyimpan nilai jari2

    double getR()   //Getter, digunakan untuk mengambil atau menggunakan nilai jari2 objek lingkaran
    {
        return this.r;
    }

    void setR(double r) //Setter, digunakan untuk mengatur atau mengubah nilai jari2 objek lingkaran berdasarkan parameter masukan yaitu r
    {
        this.r = r;
    }

    public double cariluas() //Method yang sudah dioverride
    {
        return this.r*this.r*3.14;  //Rumus luas lingkaran
    }
}
