/*[
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul2;

/**
 *
 * @author LENOVO
 */
public class Teacher extends Induk {
    
    private String jurusan ;
    private String mata_kuliah;

void setjurusan(String jurusan){
    this.jurusan= jurusan;
}
void setmata_kuliah(String mata_kuliah){
    this.mata_kuliah = mata_kuliah;
}
String getjurusan(){
    return jurusan;
}
String getmata_kuliah(){
    return mata_kuliah;
}
}
