package com.example.mypackage;

public abstract class ListItem {

    protected ListItem rightLink = null;
    protected ListItem leftLink = null;
    protected Object value;

    public ListItem(Object value){
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    abstract ListItem next();
    abstract ListItem previous();

    abstract ListItem SetNext(ListItem item);
    abstract ListItem SetPrevious(ListItem item);

    abstract int compareTo(ListItem item);
}
