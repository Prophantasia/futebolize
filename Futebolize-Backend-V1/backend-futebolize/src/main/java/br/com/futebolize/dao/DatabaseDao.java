package br.com.futebolize.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// @Desenvolvido por: Matheus Campos
public class DatabaseDao {

    public void createDatabase() {
        String sql = "CREATE TABLE IF NOT EXISTS CUSTOMER (" +
                "ID INT AUTO_INCREMENT NOT NULL," +
                "NAME VARCHAR(50) NOT NULL," +
                "CPF VARCHAR(11) NOT NULL," +
                "ADDRESS VARCHAR(300) NOT NULL," +
                "PHONE_NUMBER VARCHAR(11) NOT NULL," +
                "EMAIL VARCHAR(50)," +
                "PASSWORD VARCHAR(30)," +
                "PRIMARY KEY (ID));";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.execute();
            System.out.println("Tabela CUSTOMER criada!");
            ps.close();
        } catch (SQLException err) {
            System.out.println("Erro ao criar a tabela CUSTOMER. ERRO: "+err.getMessage());
        }
    }
}
