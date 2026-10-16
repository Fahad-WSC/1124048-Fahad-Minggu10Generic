package pbo.models;

public class Mahasiswa {

    public String nim;
    public String nama;
    public String kodeJurusan;

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public Mahasiswa(String nim, String nama, String kodeJurusan) {
        this.nim = nim;
        this.nama = nama;
        this.kodeJurusan = kodeJurusan;
    }

    @Override
    public String toString() {
        return nim + " - " + nama;
    }
}