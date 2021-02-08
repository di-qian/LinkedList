package com.example.mypackage;

public class SearchTree implements NodeList{
    private ListItem root = null;

    public SearchTree(ListItem root){
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null){
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while(currentItem !=null){
            int compareResult = currentItem.compareTo(newItem);
            if(compareResult<0){
                if(currentItem.next() != null){
                    currentItem = currentItem.next();
                }else{
                    currentItem.SetNext(newItem);
                    return true;
                }
            }else if(compareResult>0){
                if(currentItem.previous()!=null){
                    currentItem = currentItem.previous();
                }else{
                    currentItem.SetPrevious(newItem);
                    return true;
                }
            }else{
                System.out.println(newItem.getValue() + " already exist in the list, not added.");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        //recursive method
        if(root != null){
            traverse((root.previous()));
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }
}
