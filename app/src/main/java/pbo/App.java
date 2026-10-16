package pbo;

import java.util.List;
import java.util.Scanner;
import pbo.models.Mahasiswa;
import pbo.repository.MahasiswaRepository;

public class App {

    private Scanner scanner = new Scanner(System.in);

    public App() {
        printAllMahasiswa();

        while (true) {
            System.out.print("\nTambahkan Mahasiswa? (y/n): ");
            String input = scanner.nextLine().toLowerCase();

            if (input.equals("y")) {
                addNewMahasiswa();
            } else {
                break;
            }

            printAllMahasiswa();
        }
    }

    private void addNewMahasiswa() {
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();

        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Kode Jurusan (IF/SI): ");
        String kodeJurusan = scanner.nextLine();

        Mahasiswa mhs = new Mahasiswa(nim, nama, kodeJurusan);
        MahasiswaRepository.addMahasiswa(mhs);
    }

    private void printAllMahasiswa() {
        List<Mahasiswa> allMahasiswa = MahasiswaRepository.getAllMahasiswa();
        System.out.println("\n📋 Daftar Mahasiswa:");
        for (Mahasiswa m : allMahasiswa) {
            System.out.println(m.nim + " - " + m.nama + " (" + m.kodeJurusan + ")");
        }
    }

    public static void main(String[] args) {
        new App();
    }
}