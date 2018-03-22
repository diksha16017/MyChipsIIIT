package com.example.root.chips_ta;

/**
 * Created by root on 12/3/18.
 */
import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tokenautocomplete.FilteredArrayAdapter;

import java.util.List;

public class AddProjectFilterAdapter extends FilteredArrayAdapter<ProjectMembers> {

    public AddProjectFilterAdapter(Context context, int resource, List<ProjectMembers> objects) {
        super(context, resource,  objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {

            LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.project_item_member_add, parent, false);
        }

        ProjectMembers contact = getItem(position);
        ((TextView) convertView.findViewById(R.id.name)).setText(contact != null ? contact.getName() : null);
        ((TextView) convertView.findViewById(R.id.email)).setText(contact != null ? contact.getLabel() : null);

        return convertView;
    }

    @Override
    protected boolean keepObject(ProjectMembers person, String mask) {
        mask = mask.toLowerCase();
        return person.getName().toLowerCase().startsWith(mask) || person.getLabel().toLowerCase().startsWith(mask);
    }
}
