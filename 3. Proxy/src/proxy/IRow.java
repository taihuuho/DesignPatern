/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

/**
 *
 * @author 984571
 */
public interface IRow {
    public String getColumn(int column);
    public void setColumn(int column, String value);
}
