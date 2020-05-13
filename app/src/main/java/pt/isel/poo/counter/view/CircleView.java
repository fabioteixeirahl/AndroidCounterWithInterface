/**
 * Fábio Teixeira 5/2020
 */

package pt.isel.poo.counter.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import pt.isel.poo.counter.model.Listener;

public class CircleView extends View implements Listener {

    Paint paint = new Paint();
    final int R = 30;
    final int FACTOR = 10;
    private int value;

    public CircleView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int x = value*FACTOR;
        int y = getHeight()/2;
        canvas.drawCircle(x, y, R, paint);
    }

    @Override
    public void update(int counter) {
        value = counter;
        invalidate();
    }

}
