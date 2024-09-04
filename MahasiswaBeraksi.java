package mahasiswa;

public class MahasiswaBeraksi {
    public static void main(String[] args){
        Mahasiswa mahasiswa; 
        mahasiswa = new Mahasiswa();
        
       // manggil method method yang sudah di buat
        mahasiswa.membaca();
        mahasiswa.nyontek();
        mahasiswa.modifikasi();
    }
    
}
