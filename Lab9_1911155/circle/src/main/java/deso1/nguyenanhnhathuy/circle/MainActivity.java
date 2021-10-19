package deso1.nguyenanhnhathuy.circle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    float values[]={300,400,100,500};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout linear1 = (LinearLayout) findViewById(R.id.linear);
        values= calculateData(values);
        linear1.addView(new MyGraphview(this, values));


    }
    private float[] calculateData(float[] data) {
        // TODO Auto-generated method stub
        float total=0;

        for(int i=0;i<data.length;i++)
        {
            total+=data[i];
        }

        for(int i=0;i<data.length;i++)
        {

            data[i]=360*(data[i]/total);
        }
        return data;

    }
    public class MyGraphview extends View {
        private Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        int bk = 400;
        private float[] value_degree;
        private int[] COLORS = {Color.BLUE, Color.GREEN, Color.RED, Color.CYAN};

        float temp = 0;

        public MyGraphview(Context context, float[] values) {

            super(context);
            value_degree = new float[values.length];
            for (int i = 0; i < values.length; i++) {
                value_degree[i] = values[i];
            }
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            int left = getWidth()/2 - bk;
            int right = getWidth()/2 + bk;
            int top = getHeight()/2 - bk;
            int bot = getHeight()/2 +bk;
            RectF rectf = new RectF(left, top, right, bot);
            for (int i = 0; i < value_degree.length; i++) {//values2.length; i++) {
                if (i == 0) {
                    paint.setColor(COLORS[i]);
                    canvas.drawArc(rectf, 0, value_degree[i], true, paint);
                }
                else
                {
                    temp += (float) value_degree[i-1];
                    paint.setColor(COLORS[i]);
                    canvas.drawArc(rectf, temp, value_degree[i], true, paint);
                }

            }
        }
    }



}