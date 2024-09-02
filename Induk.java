/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul2;

import java.time.LocalDate;

/**
 *
 * @author LENOVO
 */
class Community {
  
    private int ID;
    private String Nama;
    private String Alamat;
    private String email;
    private java.time.LocalDate Tanggal_masuk;
    
     public void setID(int ID){
     this.ID = ID;
        
    }
    public int getID(){
        return ID;
    }
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    public String getNama(){
        return Nama;
    }
    public void setAlamat(String Alamat){
        this.Alamat=Alamat;
    }
    public String getAlamat(){
        return Alamat;
    }
    public void Setemail(String email){
        this.email = email;
    }
    String getemail(){
        return email;
    }
    public void setTanggal_masuk(int year, int month , int day){
        this.Tanggal_masuk=  LocalDate.of(year, month, month);
    }
    public LocalDate getTanggal_masuk(){
        return Tanggal_masuk;
    }
}
