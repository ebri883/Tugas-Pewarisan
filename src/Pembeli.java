/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;


/**
 *
 * @author GokuJawa
 */

public class Pembeli extends Barang
{
    public String nama_pembeli, alamat;
    public long  no_telp;
    public int id_pembeli;
    
   
    
    public Pembeli(int id_pembeli, String nama_pembeli, String alamat, long no_telp, int id_barang, String nama_b, String merk, int harga)
    {
        super(id_barang, harga, nama_b, merk);
        this.nama_pembeli = nama_pembeli;
        this.alamat = alamat;
        this.id_pembeli = id_pembeli;
        this.no_telp = no_telp;
    }

    
    
    public String getNama_pembeli() {
        return nama_pembeli;
    }

    public void setNama_pembeli(String nama_pembeli) {
        this.nama_pembeli = nama_pembeli;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getId_pembeli() {
        return id_pembeli;
    }

    public void setId_pembeli(int id_pembeli) {
        this.id_pembeli = id_pembeli;
    }

    public long getNo_telp() {
        return no_telp;
    }

    public void setNo_telp(long no_telp) {
        this.no_telp = no_telp;
    }
   
    
    @Override
    public void info()
    {
        System.out.println("Id Pembeli      : "+getId_pembeli());
        System.out.println("Nama Pembeli    : "+getNama_pembeli());
        System.out.println("Alamat          : "+getAlamat());
        System.out.println("No. Telepon     : "+getNo_telp());
        System.out.println("Id Barang       : "+getId_barang());
        System.out.println("Nama Barang     : "+getNama_b());
        System.out.println("Merk Barang     : "+getMerk());
        System.out.println("Harga Barang    : "+getHarga());
    }
}

