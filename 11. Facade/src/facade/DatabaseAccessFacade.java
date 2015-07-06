/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 984571
 */
public class DatabaseAccessFacade implements IDatabaseAccess {

    private static final String DATABASE_DRIVER = "";
    private static final String DATABASE_URL = "";

    Connection conn = null;
    PreparedStatement prep = null;
    CallableStatement call = null;
    ResultSet rset = null;

    @Override
    public ResultSet executeQuery(String query, String[] params) {
        try {

            prep = conn.prepareStatement(query);
            for (int i = 0; i < params.length; i++) {
                prep.setString(i + 1, params[i]);
            }
            rset = prep.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseAccessFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rset;
    }

    @Override
    public int executeStoreProcedure(String storeProcedureName) {

        try {
            call = conn.prepareCall(storeProcedureName);
            call.setInt(1, 1972);
            call.registerOutParameter(2, java.sql.Types.INTEGER);
            call.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseAccessFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;

    }

    @Override
    public void cleanUp() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
            }
        }
        if (rset != null) {
            try {
                rset.close();
            } catch (SQLException ex) {
            }
        }
        if (prep != null) {
            try {
                prep.close();
            } catch (SQLException ex) {
            }
        }
        if (call != null) {
            try {
                call.close();
            } catch (SQLException ex) {
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
            }
        }
    }

    @Override
    public void openConnection() {
        try {
            Class.forName(DATABASE_DRIVER).newInstance();
            conn = DriverManager.getConnection(DATABASE_URL);
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DatabaseAccessFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
