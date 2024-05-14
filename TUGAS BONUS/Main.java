public class Main {
    public static void main(String[] args) {
        Dosen dosen = new Dosen();
        dosen.nama = "Budi";
        dosen.nip = "123456";
        dosen.gaji = 5000000;
        dosen.ikutPenelitian();
        dosen.mengajar("Pemrograman");
        dosen.mengasihtugas();
        dosen.menilaiTugas();
        dosen.makanDiKantin("A");
        dosen.mainGameCorner();
        dosen.naikLift();

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.nama = "Ani";
        mahasiswa.nim = "210101";
        mahasiswa.ipk = 3.5;
        mahasiswa.golUkt = 2;
        mahasiswa.ngerjainTugas();
        mahasiswa.pasrah();
        mahasiswa.mengikutiOrganisasi("BEM");
        mahasiswa.presentasi();
        mahasiswa.makanDiKantin("B");
        mahasiswa.mainGameCorner();
        mahasiswa.naikLift();
        mahasiswa.masukKelas();

        Asprak asprak = new Asprak();
        asprak.nama = "Siti";
        asprak.nim = "210102";
        asprak.ipk = 3.8;
        asprak.golUkt = 1;
        asprak.ngerjainTugas();
        asprak.pasrah();
        asprak.mengikutiOrganisasi("Himpunan");
        asprak.presentasi();
        asprak.makanDiKantin("C");
        asprak.mainGameCorner();
        asprak.naikLift();
        asprak.masukKelas();
        asprak.ngasihKomenDiGCR();

        Resepsionis resepsionis = new Resepsionis();
        resepsionis.nama = "Citra";
        resepsionis.idResepsionis = 1;
        resepsionis.jabatan = "Senior Resepsionis";
        resepsionis.gaji = 3000000;
        resepsionis.melayani();
        resepsionis.melapor();
        resepsionis.makanDiKantin("D");
        resepsionis.mainGameCorner();
        resepsionis.naikLift();
    }
}