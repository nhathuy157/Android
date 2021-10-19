package deso1.nguyenanhnhathuy.columns;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import java.util.Random;

public class MyCanvas extends View {
    Random rd = new Random();
    public  int number;
    int[] colors = new int[]{Color.RED,Color.GRAY,Color.YELLOW,Color.GREEN,Color.CYAN};
    public  MyCanvas(Context context, AttributeSet attrs)
    { super(context, attrs, 0); }
    private void drawRect(Canvas canvas){
        int viewWidth = getWidth();
        int viewHeight = getHeight();
        Paint mPaint = new Paint();
        for(int i =0; i< number;i++){
            int columnHeight = rd.nextInt(viewHeight);
            mPaint.setColor(colors[rd.nextInt(colors.length)]);

            float columnWidth = (viewWidth )/number;
            canvas.drawRect((columnWidth * i ), columnHeight,columnWidth*(i +1),
                    viewHeight,mPaint);
        }
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //Vẽ cột
        drawRect(canvas);

    }
}
