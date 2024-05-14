public class Mahasiswa extends Civitas implements PesertaKelas {
    String nim;
    double ipk;
    int golUkt;
    
    void ngerjainTugas() {
        System.out.println(nama + " mengerjakan tugas");
    }
    
    void pasrah() {
        System.out.println(nama + " pasrah");
    }
    
    void mengikutiOrganisasi(String nama) {
        System.out.println(this.nama + " mengikuti organisasi " + nama);
    }
    
    void presentasi() {
        System.out.println(nama + " presentasi");
    }

    @Override
    public void masukKelas() {
        System.out.println(nama + " masuk kelas");
    }
}
