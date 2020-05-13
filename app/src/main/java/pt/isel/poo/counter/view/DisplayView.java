/**
 * Fábio Teixeira 5/2020
 */

package pt.isel.poo.counter.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.TextView;
import pt.isel.poo.counter.model.Listener;

@SuppressLint("AppCompatCustomView")
public class DisplayView extends TextView implements Listener {

    public DisplayView(Context context) {
        super(context);
    }

    @Override
    public void update(int counter) {
        setText(Integer.toString(counter));
    }

}
