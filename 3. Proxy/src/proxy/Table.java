/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 984571
 */
public class Table implements ITable {

    private List<IRow> rows;

    public Table() {
        rows = new ArrayList<>();
    }

    @Override
    public int numOfRows() {
        return rows.size();
    }

    @Override
    public IRow getRow(int rowNum) {
        return rows.get(rowNum);
    }

    @Override
    public void addRow(IRow row, int rowNum) {
        if (rowNum < rows.size()) {
            rows.add(rowNum, row);
        } else {
            rows.add(row);
        }
    }

    @Override
    public void modifyRow(int rowNum, IRow row) {
        rows.set(rowNum, row);
    }

    @Override
    public void deleteRow(int rowNum) {
        if (rowNum < rows.size()) {
            rows.remove(rowNum);
        } else {

        }
    }
}
