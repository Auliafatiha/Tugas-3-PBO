/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul2;

/**
 *
 * @author LENOVO
 */
public class Student extends Community{
    private String prodi;
    private String fakultas;
    private int semester;
    private String status;
    private String jenjang;
    
    void setprodi(String prodi){
        this.prodi = prodi;
    }
    void setfakultas(String fakultas){
        this.fakultas = fakultas;
    }
    void setsemester(int semester){
        this.semester = semester;
    }
    void setstatus(String status){
        this.status = status;
    }
    void setjenjang(String jenjang){
        this.jenjang = jenjang;
    }
    String getprodi(){
        return prodi;
        
    }
    String getfakultas(){
        return fakultas;
    }
    int getsemester(){
        return semester;
    }
    String getstatus(){
        return status;
    }
    String getjenjang(){
        return jenjang;
    }
}
