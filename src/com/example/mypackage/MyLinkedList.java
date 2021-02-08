package com.example.mypackage;

public class MyLinkedList implements NodeList{
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
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
                    currentItem.SetNext(newItem).SetPrevious(currentItem);
                    return true;
                }
            }else if(compareResult>0){
                if(currentItem.previous()!=null){
                    currentItem.previous().SetNext(newItem).SetPrevious(currentItem.previous());
                    newItem.SetNext(currentItem).SetPrevious(newItem);
                }else{
                    this.root.SetPrevious(newItem).SetNext(this.root);
                    this.root = newItem;
                }
                return true;
            }else{
                System.out.println(newItem.getValue() + " already exist in the list, not added.");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if(item != null){
            System.out.println("Deleting item "+ item.getValue());
        }

        ListItem currentItem = this.root;
        while(currentItem != null){
            int comparison = currentItem.compareTo(item);
            if(comparison==0){
                if(currentItem==this.root){
                    this.root = currentItem.next();
                }else{
                    currentItem.previous().SetNext(currentItem.next());
                    if(currentItem.next() != null){
                        currentItem.next().SetPrevious(currentItem.previous());
                    }
                }
                return true;
            }else if(comparison < 0){
                currentItem = currentItem.next();
            }else{
                return false;
            }

        }
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if(root !=null){
            while(root !=null){
                System.out.println(root.getValue());
                root = root.next();
            }
        }else {
            System.out.println("We are at the end of the list");
        }

    }
}
