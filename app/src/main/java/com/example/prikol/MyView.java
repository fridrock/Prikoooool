package com.example.prikol;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;

public class MyView extends View {
    public MyView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        //super.onDraw(canvas);
        /*Paint p  = new Paint();
        p.setColor(Color.parseColor("#000000"));
        p.setColor(Color.RED);
        p.setStrokeWidth(20);
        p.setAntiAlias(true);
        // сглаживание
        canvas.drawPaint(p);
        p.setColor(Color.YELLOW);
        p.setStyle(Paint.Style.FILL);
        canvas.drawCircle(300,300,100,p);
        canvas.drawLine(300,300,600,600,p);
        p.setTextSize(60);
        canvas.drawText("My it school",40,40,p);

        Path pa = new Path();
        pa.moveTo(100,100);
*/

        /*Rect r = new Rect();
штриховка
Paint pa  = new Paint();
pa.setColor(Color.RED);
pa.setStrokeWidth(20);
pa.setStyle(Paint.Style.STROKE);
Path p = new Path();


for (int i  = 0;i<=1000;i+=100){
    p.moveTo(0,0+i);
    p.lineTo(400,0+i+200);
}
        p.close();
        canvas.drawPath(p,pa);

*/




        Paint p = new Paint();
        p.setColor(Color.GREEN);
        p.setStyle(Paint.Style.FILL);

        canvas.drawRect(0,canvas.getHeight()/5*4,canvas.getWidth(),canvas.getHeight(),p);
        p.setColor(Color.parseColor("#1f0202"));
        canvas.drawRect(100,canvas.getHeight()/10*6,550,canvas.getHeight()/10*9,p);


        // крыша
        Path path = new Path();
        path.moveTo(75,canvas.getHeight()/5*4);
        path.lineTo(200,-300);
        path.moveTo(200,canvas.getHeight()/10*7);
        path.lineTo(600,canvas.getHeight()/5*4);
        path.moveTo(200,canvas.getHeight()/10*7);
        path.lineTo(75,canvas.getHeight()/5*4);
        p.setStyle(Paint.Style.STROKE);
        path.close();
        canvas.drawPath(path,p);
    }
}
