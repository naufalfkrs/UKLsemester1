/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UKLsemester1;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class UKL_SeleksiKondisi {
    public static void main(String[] args) {
        // TODO code application logic here
        String Cottage,hari,iPelanggan;
        String nama = null ;
        int jumlahhari,jenisday=0;
        int jumlahbayar;
        String room[][] ={
            {"Duku", "915000", "1025000", "1225000"},
            {"Jeruk", "915000", "1025000", "1225000"},
            {"Alpukat", "575000", "695000", "895000"},
            {"Jambu Air", "575000", "695000", "895000"},
            {"Durian", "595000", "715000", "915000"},
            {"Melon", "595000", "715000", "915000"},
            {"Belimbing", "495000", "575000", "755000"},
            {"Mangga", "495000", "575000", "755.000"},
            {"Kedondong", "495000", "575000", "755000"},
        }; 
        String pelanggan [][]={
            {"1","Ali"},
            {"2","Budi"},
            {"3","Dani"},
            {"4","Edi"},
            {"5","Umar"},
        };
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan ID Pelanggan : ");
        iPelanggan=input.next();
        for (int i = 0; i < pelanggan.length; i++) {
            if(pelanggan[i][0].equals(iPelanggan))
                nama=pelanggan[i][1];
            
        } 
        System.out.print(nama);       
        System.out.print("Cottage: ");
        Cottage=input.next();
        System.out.print("Lama menginap (hari): ");
        jumlahhari =input.nextInt();        
        System.out.print("Jenis Hari: ");
        hari=input.next();
        if(hari.equals("Weekday")){
            jenisday=1; 
        }
        else if(hari.equals("Weekend")){
            jenisday=2;
        }
        else if(hari.equals("Holiday")){
            jenisday=3;
        }
        else{
            System.out.println("Tidak Ada");
        }
        
        
        for (int i = 0; i < room.length; i++) {
            if(room[i][0].equals(Cottage)){
                    jumlahbayar=jumlahhari*Integer.parseInt(room[i][jenisday]);
                    System.out.println("Jumlah Bayar: "+jumlahbayar);
                }
            
        }           
    }
}
