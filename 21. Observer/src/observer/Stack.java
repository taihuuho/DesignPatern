package observer;

import java.util.ArrayList;
import java.util.List;

public class Stack implements Subject {

    private final List<Observer> observers;

    private final List<String> names;

    private String action;
    private String item;

    public Stack() {
        observers = new ArrayList<>();
        names = new ArrayList<>();
    }

    public List<String> getNames() {
        return names;
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        int n = observers.size();
        for (int i = 0; i < n; ++i) {
            Observer observer = (Observer) observers.get(i);
            observer.update(this.action, this.item, this.names);
        }
    }

    public void updateData() {
        notifyObservers();
    }

    public void push(String item) {
        this.action = "PUSH";
        this.item = item;
        names.add(item);

        updateData();
    }

    public void pop() {
        if (names.size() > 0) {
            this.action = "POP";
            this.item = "";
            names.remove(names.size() - 1);
            updateData();
        }

    }

}
