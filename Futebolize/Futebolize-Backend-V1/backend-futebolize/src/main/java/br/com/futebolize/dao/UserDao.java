package br.com.futebolize.dao;

import br.com.futebolize.model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


// @Desenvolvido por: Matheus Campos, Rafael Abrantes & Gabriel Henrique
public class UserDao {

    //Envio dos usuários para o banco de dados
    public void createUser(User user) {
        String SQl = "INSERT INTO CUSTOMER (NAME, CPF, ADDRESS, PHONE_NUMBER, EMAIL, PASSWORD, NIVEL) VALUES (?, ?, ?, ?, ?, ?, 'default')";

        try {
            // Realiza a conexão com o banco
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");
            PreparedStatement preparedStatement = connection.prepareStatement(SQl);
            System.out.println("success in database connection");

            // Insere na query os valores
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getCpf());
            preparedStatement.setString(3, user.getAdress());
            preparedStatement.setString(4, user.getPhone());
            preparedStatement.setString(5, user.getEmail());
            preparedStatement.setString(6, user.getPassword());

            // Executa a query
            preparedStatement.execute();


            System.out.println("success in insert user");
            connection.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("fail in database connection");
        }
    }

}