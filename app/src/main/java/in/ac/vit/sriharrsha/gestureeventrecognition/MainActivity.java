package in.ac.vit.sriharrsha.gestureeventrecognition;

import android.os.Bundle;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements OnGestureListener,GestureDetector.OnDoubleTapListener {
    TextView action;
    GestureDetectorCompat detector;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        action=(TextView)findViewById(R.id.action);
        detector = new GestureDetectorCompat(this,this);
      //  detector.setOnDoubleTapListener(this);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.detector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }


    @Override
    public boolean onDown(MotionEvent e) {
        action.setText("onDown");

        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        action.setText("onShowPress");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        action.setText("onSingleTapUp");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        action.setText("onScroll to distance (x,y):("+distanceX+","+distanceY+")");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        action.setText("onLongPress");

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        action.setText("onFling");
        return true;
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        action.setText("onSingleTapConfirmed");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        action.setText("onDoubleTap");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        action.setText("onDoubleTapEvent");
        return true;
    }
}
