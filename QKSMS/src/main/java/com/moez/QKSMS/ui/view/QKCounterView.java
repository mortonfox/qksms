package com.moez.QKSMS.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;

/**
 * Created by pcheah on 09/09/2015.
 */
public class QKCounterView extends QKTextView {
    public QKCounterView(Context context) {
        super(context);
    }

    public QKCounterView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public QKCounterView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void init(Context context, AttributeSet attrs) {
        setGravity(getGravity() | Gravity.TOP); // Make sure that the gravity is set to the top
        setPadding(0,0,0,0);

        super.init(context, attrs);
    }
}
