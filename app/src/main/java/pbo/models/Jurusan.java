package pbo.models;

public class Jurusan {

    public String kodeJurusan;
    public String nama;

    public Jurusan(String kodeJurusan, String nama) {
        this.kodeJurusan = kodeJurusan;
        this.nama = nama;
    }

    @Override
    public String toString() {
        return kodeJurusan + " - " + nama;
    }
}