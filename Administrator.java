/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul2;

/**
 *
 * @author LENOVO
 */
// extends artinya Administrator mengambil atribut pada induk atau mewarisi atribut induk 
//extends menghindari adanya penulisan ulang atribut dimana pada suatu class membutuhkan atribut yang sama yang dimiliki oleh kelas lain
// sehingga pengguna extends hanya perlu menulis atau menambahkan atribut yang ia perlu
public class Administrator extends Induk {
    private String departemen;
    
    public void setdepartemen(String departemen){
    this.departemen = departemen;
    }
    public String getdepartemen(){
        return departemen;
    }
}

