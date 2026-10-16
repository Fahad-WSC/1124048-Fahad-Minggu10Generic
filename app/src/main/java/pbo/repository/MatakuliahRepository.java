package pbo.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import pbo.database.Database;
import pbo.models.Matakuliah;

public class MatakuliahRepository {

    private static final Connection conn;

    static {
        conn = Database.connect();
    }

    public static void addMatakuliah(Matakuliah mk) {
        String sql = "INSERT INTO matakuliah (kode_matakuliah, nama, sks, kode_jurusan) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, mk.kodeMatakuliah);
            preparedStatement.setString(2, mk.nama);
            preparedStatement.setInt(3, mk.sks);
            preparedStatement.setString(4, mk.kodeJurusan);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Matakuliah> getAllMatakuliah() {
        List<Matakuliah> result = new ArrayList<>();
        String sql = "SELECT kode_matakuliah, nama, sks, kode_jurusan FROM matakuliah";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                result.add(
                    new Matakuliah(
                        resultSet.getString("kode_matakuliah"),
                        resultSet.getString("nama"),
                        resultSet.getInt("sks"),
                        resultSet.getString("kode_jurusan")
                    )
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void updateMatakuliah(Matakuliah mk) {
        String sql = "UPDATE matakuliah SET nama = ?, sks = ?, kode_jurusan = ? WHERE kode_matakuliah = ?";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, mk.nama);
            preparedStatement.setInt(2, mk.sks);
            preparedStatement.setString(3, mk.kodeJurusan);
            preparedStatement.setString(4, mk.kodeMatakuliah);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteMatakuliah(String kodeMatakuliah) {
        String sql = "DELETE FROM matakuliah WHERE kode_matakuliah = ?";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, kodeMatakuliah);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}