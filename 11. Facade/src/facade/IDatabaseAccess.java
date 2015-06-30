/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import java.sql.ResultSet;
import java.util.HashMap;

/**
 *
 * @author 984571
 */
public interface IDatabaseAccess {
    public ResultSet executeQuery(String query, HashMap params);
    public int executeStoreProcedure(String storeProcedureName);
}
