package nilai;

public class DemoNilai {
    public static void main(String[] args) {
        // Membuat objek dari class Nilai dan mengisi nilai-nilai
        Nilai nilai;
        nilai = new Nilai("2310631170125", "Anya Sabrina Narulita", 90, 90, 85, 95);

        // Memanggil method CetakNilai untuk mencetak nilai-nilai
        nilai.CetakNilai();
    }
}