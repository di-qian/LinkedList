package com.example.mypackage;

public class Node extends ListItem {
    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.rightLink;
    }

    @Override
    ListItem previous() {
        return this.leftLink;
    }

    @Override
    ListItem SetNext(ListItem item) {
        this.rightLink = item;
        return this.rightLink;
    }

    @Override
    ListItem SetPrevious(ListItem item) {
        this.leftLink = item;
        return this.leftLink;
    }

    @Override
    int compareTo(ListItem item) {
        if(item != null){
            return ((String) super.getValue()).compareTo((String) item.getValue());
        }else{
            if((String) this.getValue() == (String) item.getValue()){
                return 0;
            }else {
                return -1;
            }

        }

    }
}
