import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Pelanggan extends DataPelanggan {
    
    //method input data pelanggan
    public void inputPelanggan(){
        Scanner strg = new Scanner(System.in);
        Scanner intg = new Scanner(System.in);
        System.out.println("SELAMAT DATANG DI SUPERMARKET PALING SUPER");
        System.out.println("===============");
        while (inputUsrnm != usrnm || inputPw != pw || inputCap != cap) {
            System.out.println("Masukkan Username   : ");
            inputUsrnm = strg.nextLine();

            System.out.println("Masukkan Password   : ");
            inputPw = strg.nextLine();

            if (inputUsrnm.equals(usrnm) && inputPw.equals(pw)) {
                System.out.println("(Anda Berhasil Login)\n");
                System.out.println("(Selanjutnya masukkan Captcha)");
                System.out.println("Kode Captcha    = K4S1R");
                System.out.println("Entry Captcha   : ");
                inputCap = strg.nextLine();

            System.out.println("---------------");
            break;
            
            }
            else  {
                System.out.println("(Anda Gagal Login)\n");
                System.out.println("(Silahkan Login Kembali)");
            }

            }
            if (inputCap.equalsIgnoreCase(cap)) {
        System.out.println("Masukkan Nomor Faktur : ");
        noFaktur = strg.next();
        System.out.println("Masukkan Nama Anda : ");
        nama = strg.next();
        System.out.println("Masukkan Nomor HP Anda : ");
        noHP = strg.next();
        System.out.println("Masukkan Alamat Anda : ");
        alamat = strg.next();
        System.out.println("Masukkan Kode Barang : ");
        kodeBarang = strg.next();
        System.out.println("Masukkan Nama Barang : ");
        namaBarang = strg.next();
        System.out.println("Masukkan Harga Barang : ");
        hargaBarang = intg.nextInt();
        System.out.println("Masukkan Jumlah Barang : ");
        jumlahBarang = intg.nextInt();

        }
    }

    //method output    
    public void outp(){
        Integer totalBayar = hargaBarang*jumlahBarang;
        this.totalBayar = totalBayar;
        Date date = new Date();
        SimpleDateFormat tanggal = new SimpleDateFormat("EEEEEE, dd/MM/yyyy");
        SimpleDateFormat waktu = new SimpleDateFormat("hh:mm:ss z");

        System.out.println("SUPERMARKET PALING SUPER");
        System.out.println("Tanggal         : " + tanggal.format(date));
        System.out.println("Waktu           : " + waktu.format(date));
        System.out.println("===============");
        System.out.println("DATA PELANGGAN");
        System.out.println("---------------");
        System.out.println("No Faktur       : " + noFaktur);
        System.out.println("Nama Pelanggan  : " + nama);
        System.out.println("No HP           : " + noHP);
        System.out.println("Alamat          : " + alamat);
        System.out.println("+++++++++++++++++++++");
        System.out.println("DATA PEMBELIAN BARANG");
        System.out.println("---------------------");
        System.out.println("Kode Barang     : " + kodeBarang);
        System.out.println("Nama Barang     : " + namaBarang);
        System.out.println("Harga           : " + hargaBarang);
        System.out.println("Jumlah          : " + jumlahBarang);
        System.out.println("Total Bayar     : " + this.totalBayar);
        System.out.println("+++++++++++++++++++++");
        System.out.println("Kasir           : Ari");


    }
    
}
