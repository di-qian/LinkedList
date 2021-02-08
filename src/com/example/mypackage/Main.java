package com.example.mypackage;

public class Main {

    public static void main(String[] args) {
	    SearchTree tree = new SearchTree(null);

	    tree.traverse(tree.getRoot());

	    String stringData = "Beijing Shanghai Chengdu Nanjing Tianjin Guangzhou Shenzhen Chongqing Beijing Shanghai";
	    String[] data = stringData.split(" ");
	    for(String s : data){
	        tree.addItem(new Node(s));
        }

        tree.traverse(tree.getRoot());
	    //tree.removeItem(new Node("Chengdu"));
		//tree.traverse(tree.getRoot());
    }
}
