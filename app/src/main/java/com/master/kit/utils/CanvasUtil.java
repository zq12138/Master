package com.master.kit.utils;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by master on 2016/4/8.
 */
public class CanvasUtil {
    /**
     * 以x和y为中心绘画文字内容，普通drawText中x,y为文字的左下角；
     * @param text
     * @param x
     * @param y
     * @param canvas
     * @param paint
     */
    public static void drawText(String text, float x, float y, Canvas canvas , Paint paint ){
        canvas.drawText(text,x-paint.measureText(text)/2,y+paint.measureText(text,0,1)/2,paint);
    }
}