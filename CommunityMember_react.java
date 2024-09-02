/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul2;

/**
 *
 * @author LENOVO
 */
public class CommunityMember_react {
    public static void main(String[] args) {
        
         Alumnus alumnus = new Alumnus();
      alumnus.setid_alumnus(139872);
      alumnus.setID(3402412);
      alumnus.setNama("Agam Syeilendra");
      alumnus.Setemail("agamsyel@gmail.com");
      alumnus.setAlamat("RT 10 RW 06 Ds.Bendul Kec.Papeda Kab.Gianyar");
       alumnus.setprodi("Teknik Elektro");
      alumnus.setfakultas("Sains dan Teknologi");
    alumnus.setgelar("S.T");
     alumnus.settaanggal_lulus(2022, 02, 17);
     alumnus.setTanggal_masuk(2018,07, 11);
     alumnus.setpekerjaan("Teknisi");
     
     Student student = new Student();
       student.setID(9023401);
       student.setNama("Sagara Putra");
       student.Setemail("saga@gmail.com");
       student.setAlamat("Perum Bugenvile no 10 Surabaya");
       student.setprodi("Teknik Mesin");
       student.setfakultas("Sains dan Teknologi");
       student.setsemester(3);
       student.setjenjang("Strata1");
       student.setstatus("Aktif");
       student.setTanggal_masuk(2023,10, 15);
    
      Employee employee = new Employee();
       employee.setID(543109);
       employee.setNama("Rezki Anugrah");
       employee.Setemail("rezki@gmail.com");
       employee.setAlamat("RT 15 RW 10 Ds.Budungan Kec.Pwaykambas Kab.Ambulu");
       employee.setposisi("Layanan Mahasiswa");
       employee.setdepartemen("Sains Dan Teknologi");
       employee.setsupervisor("Achmad Raohani S.sos");
       employee.setTanggal_masuk(2019, 02, 20);
       
         Staff staff = new Staff();
       staff.setID(4509820);
       staff.setNama("Abi Permana");
       staff.Setemail("permanaabi1@gmail.com");
       staff.setAlamat("RT 12 RW 06 Ds.Banggabulan Kec.Pronojito Kab.Magelang");
       staff.setposisi("Kesehatan dan Konseling");
       staff.setdepartemen("Sains Dan Teknologi");
       staff.setTanggal_masuk(2020, 01, 10);
       staff.setkeahlian("Kesehatan");
       staff.setstatus_kepegawaian("Pegawai Tetap");
        
         Faculty faculty = new Faculty();
       faculty.setID(3040718);
       faculty.setNama("Rio Bayu");
       faculty.Setemail("bayurio@gmail.com");
       faculty.setAlamat("RT 10 RW 05 Ds.Banggabulan Kec.Pronojito Kab.Magelang");
       faculty.setFakultas("Research");
       faculty.setdepartemen("Sains Dan Teknologi");
       faculty.setTanggal_masuk(2018, 03, 15);
       faculty.setkeahlian("Tata Kelola Keuangan");
       faculty.setstatus_kepegawaian("Pegawai Tidak Tetap");
       
        Teacher dosen = new Teacher();
       dosen.setID(2020319);
       dosen.setNama("Astuti Indah");
       dosen.Setemail("Astuti12@gmail.com");
       dosen.setAlamat("Perum Citra Abadi no 12 Sidoarjo");
       dosen.setjurusan("Teknik Informatika");
       dosen.setmata_kuliah("Pemogrman Dasar");
       dosen.setTanggal_masuk(2019, 02, 10);
       
        Administrator admin = new Administrator();
       admin.setID(1020620);
       admin.setNama("Ahmad Bastomi");
       admin.Setemail("Bastomi@gmail.com");
       admin.setAlamat("jl Basuki Rachmat no 10 Surabaya");
       admin.setbagian_manajemen("Manajemen Kualitas dan Akreditasi");
       admin.setFakultas("Sains dan Teknologi");
       admin.setposisi("Staff ahli ");
       admin.setTanggal_masuk(2020, 10, 15);
       
       
        
      
       
       System.out.println("COMMUNITY MEMBER");
       System.out.println("");
       System.out.println("===== Data Alumnus =====");
       System.out.println("Id Alumnus: "+alumnus.getid_alumnus());
       System.out.println("Id Mahasiswa: " + alumnus.getID());
       System.out.println("Nama Lengkap: " +alumnus.getNama());
       System.out.println("Email: " + alumnus.getemail());
       System.out.println("ALamat: "+ alumnus.getAlamat());
       System.out.println("Program Studi: " + alumnus.getprodi());
      System.out.println("Fakultas: " + alumnus.getfakultas());
      System.out.println("Gelar: " +alumnus.getgelar());
       System.out.println("Tanggal Lulus: "+alumnus.gettanggal_lulus());
       System.out.println("Tanggal Masuk: "+alumnus.getTanggal_masuk());
      System.out.println("Pekerjaan: " + alumnus.getpekerjaan());
      
      System.out.println("");
       System.out.println("===== Data Student =====");
       System.out.println("Id Staff: " + student.getID());
       System.out.println("Nama Lengkap: " +student.getNama());
       System.out.println("Email: " + student.getemail());
       System.out.println("ALamat: "+ student.getAlamat());
       System.out.println("Program Studi: " + student.getprodi());
       System.out.println("Fakultas: " + student.getfakultas());
       System.out.println("Semester: " +student.getsemester());
       System.out.println("Jenjang: " + student.getjenjang());
       System.out.println("Status: " +student.getstatus());
       System.out.println("Tanggal Masuk: "+student.getTanggal_masuk());
       
       System.out.println("");
       System.out.println("===== Data Employee =====");
       System.out.println("Id Staff: " + employee.getID());
       System.out.println("Nama Lengkap: " +employee.getNama());
       System.out.println("Email: " + employee.getemail());
       System.out.println("ALamat: "+ employee.getAlamat());
       System.out.println("Posisi: " + employee.getposisi());
       System.out.println("Deapartemen: " + employee.getdeparetemen());
       System.out.println("Supervisor: " +employee.getsupervisor());
       System.out.println("Tanggal Masuk: "+employee.getTanggal_masuk());
       
       System.out.println("");
       System.out.println("===== Data Staff =====");
       System.out.println("Id Staff: " + staff.getID());
       System.out.println("Nama Lengkap: " +staff.getNama());
       System.out.println("Email: " + staff.getemail());
       System.out.println("ALamat: "+ staff.getAlamat());
       System.out.println("Posisi: " + staff.getposisi());
       System.out.println("Deapartemen: " + staff.getdeparetemen());
       System.out.println("Tanggal Masuk: "+staff.getTanggal_masuk());
       System.out.println("Keahlian: " + staff.getkeahlian());
       System.out.println("Status Kepegawaian: " +staff.getstatus_kepegawaian());
       
       System.out.println("");
       System.out.println("===== Data Faculty =====");
       System.out.println("Id Dosen: " + faculty.getID());
       System.out.println("Nama Lengkap: " +faculty.getNama());
       System.out.println("Email: " + faculty.getemail());
       System.out.println("ALamat: "+ faculty.getAlamat());
       System.out.println("Posisi: " + faculty.getposisi());
//       System.out.println("Deapartemen: " + faculty.getdepartemen());
       System.out.println("Tanggal Masuk: "+faculty.getTanggal_masuk());
        
        System.out.println("");
       System.out.println("===== Data Dosen =====");
       System.out.println("Id Dosen: " + dosen.getID());
       System.out.println("Nama Lengkap: " + dosen.getNama());
       System.out.println("Email: " +dosen.getemail());
       System.out.println("ALamat: "+ dosen.getAlamat());
       System.out.println("Jurusan: " +dosen.getjurusan());
       System.out.println("Mata Kuliah: " +dosen.getmata_kuliah());
       System.out.println("Tanggal Masuk: "+admin.getTanggal_masuk());
       
        System.out.println("");
       System.out.println("===== Data Administrator =====");
       System.out.println("Id Administrator: " + admin.getID());
       System.out.println("Nama Lengkap: " +admin.getNama());
       System.out.println("Email: " +admin.getemail());
       System.out.println("ALamat: "+ admin.getAlamat());
       System.out.println("Departemen: " +admin.getbagian_manajemen());
       System.out.println("Fakultas: " +admin.getfakultas());
       System.out.println("posisi: " +admin.getposisi());
       System.out.println("Tanggal Masuk: "+admin.getTanggal_masuk());
       
  
      
       
       
    }   
    
}
