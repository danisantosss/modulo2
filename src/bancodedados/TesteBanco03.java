package bancodedados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TesteBanco03 {
    public static void main(String[] args) {
        var stringConnexao = "jdbc:mariadb://localhost/dbexercx1";
        var usuario = "root";
        var senha = "univille";
        try (Connection conn = DriverManager.getConnection(stringConnexao, usuario, senha)) {
            var sql = "update aluno set nome = ? where numero = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "Mega Pata silva");
            ps.setInt(2, 12);
            var numlinhasafetadas = ps.executeUpdate();
            System.out.println("Total de linhas afetadas: " + numlinhasafetadas);
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
