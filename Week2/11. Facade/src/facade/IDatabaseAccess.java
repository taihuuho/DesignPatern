/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import java.sql.CallableStatement;
import java.sql.ResultSet;

/**
 *
 * @author 984571
 */
public interface IDatabaseAccess {
    public void openConnection();
    public ResultSet executeQuery(String query, String[] params);
    public CallableStatement executeStoreProcedure(String storeProcedureName, String[] params);
    public void cleanUp();
}
