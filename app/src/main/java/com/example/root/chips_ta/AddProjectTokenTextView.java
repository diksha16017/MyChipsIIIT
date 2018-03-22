package com.example.root.chips_ta;

/**
 * Created by root on 12/3/18.
 */
import android.content.Context;
import android.util.AttributeSet;


public class AddProjectTokenTextView extends android.support.v7.widget.AppCompatTextView {

    public AddProjectTokenTextView(Context context) {
        super(context);
    }

    public AddProjectTokenTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void setSelected(boolean selected) {
        super.setSelected(selected);
        // setCompoundDrawablesWithIntrinsicBounds(0, 0, selected ? R.drawable.ic_clear_white_18dp : 0, 0);
    }

}
