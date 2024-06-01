/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elgibran.iegcodeposv2.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Java Programming with IBRAHIM EL GIBRAN
 */
public class DBConnection {

    private static Connection con;

    public void getDBConn() {
        synchronized ("") {
            try {
                if (this.getCon() == null || this.getCon().isClosed()) {
                    try {
//                        MySQL
                        String url = "jdbc:mysql://localhost:3306/iegcodeposv2";
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        setCon(DriverManager.getConnection(url, "root", ""));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    /**
     * @return the con
     */
    public static Connection getCon() {
        return con;
    }

    /**
     * @param aCon the con to set
     */
    public static void setCon(Connection aCon) {
        con = aCon;
    }

    public static void closeConnection() {
        try {
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}