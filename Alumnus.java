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
public class Alumnus extends Induk{
    private int id_alumnus;
    private String prodi;
    private String fakultas;
    private java.time.LocalDate tanggal_lulus;
    private String gelar;
    private String pekerjaan;
    
    void setid_alumnus(int id_alumnus){
        this.id_alumnus = id_alumnus;
    }
    void setprodi(String prodi){
        this.prodi = prodi;
    }
    void setfakultas(String fakultas){
        this.fakultas = fakultas;
    }
    void settaanggal_lulus(int year, int month, int day){
        this.tanggal_lulus = LocalDate.of(year, month, month);
    }
    void setgelar(String gelar){
        this.gelar = gelar;
    }
    void setpekerjaan(String pekerjaan){
        this.pekerjaan = pekerjaan;
    }
    int getid_alumnus(){
        return id_alumnus;
    }
    String getprodi(){
        return prodi;
    }
    String getfakultas(){
        return fakultas;
    }
    LocalDate gettanggal_lulus(){
        return tanggal_lulus;
    }
    String getgelar(){
        return gelar;
    }
    String getpekerjaan(){
        return pekerjaan;
    }
}
