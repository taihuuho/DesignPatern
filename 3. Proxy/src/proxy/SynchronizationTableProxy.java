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
public class SynchronizationTableProxy implements ITable {

    private final ITable table;

    public SynchronizationTableProxy() {
        table = new Table();
    }

    @Override
    public int numOfRows() {
        return table.numOfRows();
    }

    @Override
    public IRow getRow(int rowNum) {
        return table.getRow(rowNum);
    }

    @Override
    public void addRow(IRow row, int rowNum) {
        synchronized (table) {
            table.addRow(row, rowNum);
        }
    }

    @Override
    public void modifyRow(int rowNum, IRow row) {
        synchronized (table) {
            table.modifyRow(rowNum, row);
        }
    }

    @Override
    public void deleteRow(int rowNum) {
        synchronized (table) {
            table.deleteRow(rowNum);
        }
    }
}
