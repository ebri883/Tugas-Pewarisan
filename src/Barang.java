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


public class Barang 
{
    public int id_barang, harga;
    public String nama_b, merk;
    
     public Barang(int id_barang, int harga, String nama_b, String merk)
    {
        this.id_barang = id_barang;
        this.nama_b = nama_b;
        this.merk = merk;
        this.harga = harga;
    }
    
    public int getId_barang() {
        return id_barang;
    }

    public void setId_barang(int id_barang) {
        this.id_barang = id_barang;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga_barang(int harga) {
        this.harga = harga;
    }

    public String getNama_b() {
        return nama_b;
    }

    public void setNama_b(String nama_b) {
        this.nama_b = nama_b;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }
    
    
    public void info()
    {
        
    }
}