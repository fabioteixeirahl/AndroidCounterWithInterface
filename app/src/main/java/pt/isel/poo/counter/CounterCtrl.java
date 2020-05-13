/**
 * Fábio Teixeira 5/2020
 */

package pt.isel.poo.counter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import pt.isel.poo.counter.model.CounterModel;
import pt.isel.poo.counter.view.CircleView;
import pt.isel.poo.counter.view.DisplayView;
import pt.isel.poo.counter.view.LogView;


public class CounterCtrl extends Activity {

    // Controls
    Button inc, dec;

    // Views
    CircleView circleListener;
    DisplayView displayListener;
    LogView logListener;

    // model
    CounterModel model;

    @Override
    protected void onCreate(Bundle State) {
        super.onCreate(State);

        // init model (max = 100)
        model = new CounterModel(100);

        // init controls
        inc = new Button(this);
        inc.setText("+");
        inc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                model.inc();
            }
        });
        dec = new Button(this);
        dec.setText("-");
        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                model.dec();
            }
        });

        // init view
        circleListener = new CircleView(this);
        displayListener = new DisplayView(this);
        logListener = new LogView();

        displayListener.setTextSize(70);
        displayListener.setText("0");
        displayListener.setTextAlignment(LinearLayout.TEXT_ALIGNMENT_CENTER);

        model.addListener(circleListener);
        model.addListener(displayListener);
        model.addListener(logListener);

        // Setup Layout
        LinearLayout all = new LinearLayout(this);
        all.setOrientation(LinearLayout.VERTICAL);

        LinearLayout buttons = new LinearLayout(this);
        buttons.addView(inc);
        buttons.addView(dec);

        all.addView(buttons);
        all.addView(displayListener);
        all.addView(circleListener);

        setContentView(all);
    }

}
