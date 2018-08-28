/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author GokuJawa
 */
public class Transaksasi
{
    public static void main(String[] args) 
    {
        
        Pembeli nota = new Pembeli(907, "Mohammad Retri Ebri Willyan", "Jalan Danau Kerinci V", 17299069, 14, "Buku Kisah 1001 Malam", "Taman Buku Ceria", 56000);
        System.out.println("              Bukti Pembayaran             ");
        System.out.println("===========================================");
        nota.info();
        System.out.println("===========================================");
        System.out.println("Nama Kasir  : Efendy ");
        System.out.println("Tanggal     : 28/8/2018 -- 18.46 WIB ");
        System.out.println("===========================================");
   
    }
    
}