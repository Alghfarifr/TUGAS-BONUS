public class Dosen extends Civitas implements Pengajar {
    String nip;
    double gaji;
    
    void ikutPenelitian() {
        System.out.println(nama + " mengikuti penelitian");
    }
    
    @Override
    public void mengajar(String matkul) {
        System.out.println(nama + " mengajar mata kuliah " + matkul);
    }
    
    @Override
    public void mengasihtugas() {
        System.out.println(nama + " mengasih tugas");
    }
    
    @Override
    public void menilaiTugas() {
        System.out.println(nama + " menilai tugas");
    }
}
