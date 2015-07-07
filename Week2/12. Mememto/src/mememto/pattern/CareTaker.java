/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mememto.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 984571
 */
public class CareTaker {

    private List<UserMememto> mememtoesStack = new ArrayList<>();

    public List<UserMememto> getMememtoesStack() {
        return mememtoesStack;
    }

    public void add(UserMememto state) {
        mememtoesStack.add(state);
    }

    public void remove(int index) {
        if (index < mememtoesStack.size() && index >= 0) {
            mememtoesStack.remove(index);
        }
    }

    public UserMememto get(int index) {
        if (index < mememtoesStack.size() && index >= 0) {
            return mememtoesStack.get(index);
        } else {
            return null;
        }
    }
    
    public UserMememto getLatestState(){
        if (mememtoesStack != null && mememtoesStack.size() > 0) {
            return mememtoesStack.get(mememtoesStack.size() - 1);
        } else {
            return null;
        }
    }
}
