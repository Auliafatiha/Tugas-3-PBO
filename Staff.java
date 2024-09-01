/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul2;

/**
 *
 * @author LENOVO
 */
public class Staff extends Faculty {
//    private String peran;
//    private String departemen;
    private String keahlian;
    private String status_kepegawaian;
    
//    void setposisi(String posisi){
//        this.posisi = posisi;
//    }
//    void setdepartemen(String departemen){
//      this.departemen = departemen;  
//    }
    void setkeahlian(String keahlian){
        this.keahlian = keahlian;
    }
    void setstatus_kepegawaian(String status_kepegawaian){
        this.status_kepegawaian=status_kepegawaian;
    }
//    String getposisi(){
//        return posisi;
//    }
//    String getdepartemen(){
//        return departemen;
//    }
    String getkeahlian(){
        return keahlian;
    }
    String getstatus_kepegawaian(){
        return status_kepegawaian;
    }
}
