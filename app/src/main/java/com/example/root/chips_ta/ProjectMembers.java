package com.example.root.chips_ta;

/**
 * Created by root on 12/3/18.
 */

public class ProjectMembers {
    private String label ;
    private String name ;

    public ProjectMembers(String label, String name) {

        this.label = label ;
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return getName() + "|" + getLabel();
    }
}
