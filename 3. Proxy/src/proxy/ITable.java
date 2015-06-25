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
public interface ITable {

    public int numOfRows();

    public IRow getRow(int rowNum);

    public void addRow(IRow row, int rowNum);

    public void modifyRow(int rowNum, IRow row);

    public void deleteRow(int rowNum);

}
