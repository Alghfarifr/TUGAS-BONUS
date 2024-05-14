public abstract class Civitas {
    String nama;
    int umur;
    boolean jenisKelamin;
    
    void makanDiKantin(String kantin) {
        System.out.println(nama + " makan di kantin " + kantin);
    }
    
    void mainGameCorner() {
        System.out.println(nama + " bermain di game corner");
    }
    
    void naikLift() {
        System.out.println(nama + " naik lift");
    }
}
