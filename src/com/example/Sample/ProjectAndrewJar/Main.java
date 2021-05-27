package com.example.Sample.ProjectAndrewJar;

import java.sql.*;

public class Main {

    public static void main(String[] args) {

//        try(Connection conn = DriverManager.getConnection("jdbc:sqlite:/Volumes/Production/Courses/Programs/JavaPrograms/TestDB/testjava.db");
//            Statement statement = conn.createStatement()) {
////            statement.execute("CREATE TABLE contacts (name TEXT, phone INTEGER, email TEXT)");
//        try( Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/UBUNTU/IdeaProjects/testDB/testDB.db");
//             Statement statement = conn.createStatement())
        try {
           Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/UBUNTU/IdeaProjects/testDB/testDBAndrew.db");
            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE  IF NOT EXISTS contacts(name TEXT, phone INTEGER, email TEXT)");


            statement.close();
            conn.close();

//            Connection conn = DriverManager.getConnection("jdbc:sqlite:D:\\databases\\testjava.db");
//            Class.forName("org.sql.JDBC");

        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}
