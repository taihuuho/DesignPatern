/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;
/**
 *
 * @author 984571
 */
public class Adaptee {
    
    private static final Integer MAX_ELEMENT_COUNT = 100;

    private final String[] data;
    private int start;
    private int end;

    public Adaptee(){
        data = new String[MAX_ELEMENT_COUNT];
        end = -1;
    }
    
    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public String startString() {
        return data[start];
    }

    public String endString() {
        return data[end];
    }

    public boolean empty() {
        return end == -1;
    }

    public void add(String str) throws IndexOutOfBoundsException {
        if(end == MAX_ELEMENT_COUNT - 1){
            throw new IndexOutOfBoundsException("Stack overflow");
        }
        data[++end] = str;
    }

    public void remove(int pos) {
        if (pos < start || pos > end) {
            return;
        }else if(pos == start){
            start += 1;
        }
        /*remove the String object at position 'pos' and bring
         forward all items after it*/
        for (int i = pos; i < end; i++) {
            data[i] = data[i + 1];
        }
        
        end = (end - start) > 0 ? (end - 1) : -1;
    }

    public String get(int pos) {
        return data[start + pos];
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        for(int i = start; i<= end; i++){
            builder.append(data[i]).append(", ");
        }
        
        if (!empty()){
            builder.delete(builder.length(), builder.length() - 2);
        }
        builder.append("]");
        return builder.toString();
    }

    
}
