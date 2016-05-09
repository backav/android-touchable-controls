package li.xiangyang.android.touchable_controls;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

/**
 * Created by bac on 16/5/6.
 */
public class TouchableTextView extends TextView {

    public TouchableTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    TouchableTextView.this.setAlpha(0.5f);
                }else if (motionEvent.getAction()== MotionEvent.ACTION_UP){
                    TouchableTextView.this.setAlpha(1.0f);
                }
                return false;
            }
        });
    }
}
