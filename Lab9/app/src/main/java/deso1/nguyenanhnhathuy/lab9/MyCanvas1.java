package deso1.nguyenanhnhathuy.lab9;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class MyCanvas1 extends View {

    public MyCanvas1(Context context) {
        super(context);
    }

    public MyCanvas1(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }
    private void DrawArc(Canvas canvas)
    {
        int viewWidth = getWidth();
        int viewHeight = getHeight();
        Paint mPaint = new Paint();

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        DrawArc(canvas);
    }
}
