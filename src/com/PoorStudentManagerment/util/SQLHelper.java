package com.PoorStudentManagerment.util;

import java.sql.*;

public class SQLHelper {
    private static final String Driver="org.sqlite.JDBC";
    private static final String url = "jdbc:sqlite:database.db";
    private static Connection conn = null;
    private static Statement stmt = null;

    public SQLHelper() {
        try{
            Class.forName(Driver);
            conn = DriverManager.getConnection(url);
            stmt = conn.createStatement();                            //创建语句
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
    }
    public ResultSet executeQuery(String sql){
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rs;

    }

    public int executeUpdate(String sql){
        int res = 0;
        try {
            res = stmt.executeUpdate(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return res;
    }

    public void close() throws SQLException {
        stmt.close();
        conn.close();
    }
}