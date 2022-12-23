import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;

interface MenulisFile {
    void menulis(double luas, String jenisbangun, int j);
}

public class main {
    public static void main(String[] args) {
        String jenisbangun;
        int opsi, pengulangan = 1; //opsi digunakan untuk menyimpan pilihan bangun, pengulangan 
        lingkaran bulat[] = new lingkaran[50];  //Buat array dari objek lingkaran
        for (int index = 0; index < bulat.length; index++) { 
            bulat[index] = new lingkaran();
        }
        persegipanjang kotak[] = new persegipanjang[50];
        for (int index = 0; index < kotak.length; index++) { 
            kotak[index] = new persegipanjang();
        }
        segitiga segi[] = new segitiga[50];
        for (int index = 0; index < segi.length; index++) {
            segi[index] = new segitiga();
        }
        Scanner masukkan = new Scanner(System.in); //Buat objek untuk masukan atau input data
        MenulisFile mf = (luas, jenisbangundatar, j) -> {
            try {
                FileWriter myWriter = new FileWriter("filename.txt",true);
                myWriter.write("\n"+Integer.toString(j)+". "+jenisbangundatar+ " dengan luas = "+Double.toString(luas)+".");
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
              } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
              }
        };

        for (int j = 0; j < segi.length && pengulangan == 1; j++) {
            System.out.println("Pilih bangun datar: \n1. Lingkaran\n2. Persegi Panjang\n3. Segitiga");
            opsi = masukkan.nextInt();
            if (opsi == 1) {
                jenisbangun = "Lingkaran";
                System.out.println("Masukkan jari-jari: ");
                bulat[j].setR(masukkan.nextDouble());
                mf.menulis(bulat[j].cariluas(), jenisbangun, j+1);
            }else if(opsi == 2) {
                jenisbangun = "Persegi Panjang";
                System.out.println("Masukkan panjang: ");
                kotak[j].setP(masukkan.nextDouble());
                System.out.println("Masukkan lebar: ");
                kotak[j].setL(masukkan.nextDouble());
                mf.menulis(kotak[j].cariluas(), jenisbangun, j+1);
            }else if (opsi == 3) {
                jenisbangun = "Segitiga";
                System.out.println("Masukkan alas: ");
                segi[j].setA(masukkan.nextDouble());
                System.out.println("Masukkan tinggi: ");
                segi[j].setT(masukkan.nextDouble());
                mf.menulis(segi[j].cariluas(), jenisbangun, j+1);
            } 

            System.out.println("\nJika ingin lanjut menginput, ketik 1.");
            int angka = masukkan.nextInt();
            if (angka != 1) {
                pengulangan--;
            }
        }
        masukkan.close();
    }
}
