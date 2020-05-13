/**
 * Fábio Teixeira 5/2020
 */

package pt.isel.poo.counter.model;

import java.util.ArrayList;

public class CounterModel {

    private final int max;
    private int counter;
    ArrayList<Listener> listeners;

    public CounterModel(int max) {
        counter = 0;
        this.max = max;
        listeners = new ArrayList<>();
    }

    public void addListener(Listener l){
        listeners.add(l);
    }

    public void inc() {
        if (counter < max) {
            counter++;
            updateListener(counter);
        }
    }
    public void dec() {
        if (counter > 0) {
            counter--;
            updateListener(counter);
        }
    }

    private void updateListener(int counter){
        for(Listener l : listeners){
            l.update(counter);
        }
    }

}
