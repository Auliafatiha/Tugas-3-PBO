/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul2;

/**
 *
 * @author LENOVO
 */
public class Employee extends Staff{
//    private String departemen;
//    private String peran;
    private String supervisor;
    
//    void setdepartemen(String departemen){
//        this.departemen = departemen;
//    }
//    void setperan(String peran){
//        this.peran = peran;
//    }
    void setsupervisor(String supervisor){
        this.supervisor = supervisor;
    }
//    String getdeparetemen(){
//        return departemen;
//    }
//    String getposisi(){
//        return posisi;
//    }
    String getsupervisor(){
        return supervisor;
    }
}
