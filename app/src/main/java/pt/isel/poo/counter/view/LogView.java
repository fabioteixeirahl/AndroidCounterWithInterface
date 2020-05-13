/**
 * Fábio Teixeira 5/2020
 */

package pt.isel.poo.counter.view;

import android.util.Log;
import pt.isel.poo.counter.model.Listener;

public class LogView implements Listener {

    @Override
    public void update(int counter) {
        Log.e("LogListener", "Counter changed to:" + counter);
    }

}
