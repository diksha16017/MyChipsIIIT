package com.example.root.chips_ta;

/**
 * Created by root on 12/3/18.
 */

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tokenautocomplete.TokenCompleteTextView;

public class AddProjectCompletionView extends TokenCompleteTextView<ProjectMembers> {

    public AddProjectCompletionView(Context context) {
        super(context);
    }

    public AddProjectCompletionView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public AddProjectCompletionView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected View getViewForObject(ProjectMembers contact) {
        LayoutInflater l = (LayoutInflater) getContext().getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View tokenView = l.inflate(R.layout.member_autocomplete_project, (ViewGroup) getParent(), false);
        AddProjectTokenTextView textView = (AddProjectTokenTextView) tokenView.findViewById(R.id.token_text);

        textView.setText(contact.getName());


        return tokenView;
    }

    @Override
    protected ProjectMembers defaultObject(String text) {

        return new ProjectMembers( text.substring(0,1), text );

    }

}
