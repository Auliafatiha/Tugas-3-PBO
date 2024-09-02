/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul2;

/**
 *
 * @author LENOVO
 */
public class Staff extends Employee {
//   
    private String keahlian;
    private String status_kepegawaian;
    
//   
    void setkeahlian(String keahlian){
        this.keahlian = keahlian;
    }
    void setstatus_kepegawaian(String status_kepegawaian){
        this.status_kepegawaian=status_kepegawaian;
    }

    String getkeahlian(){
        return keahlian;
    }
    String getstatus_kepegawaian(){
        return status_kepegawaian;
    }
}
