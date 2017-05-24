package com.TreeList;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        TreeItem i1 = new TreeItem("Kota");
        TreeItem i2 = new TreeItem("Ma");
        TreeItem i3 = new TreeItem("Ala");

        HashSet<TreeItem> i1Children = new HashSet<TreeItem>();
        i1Children.add(i2);
        i1.setChildren(i1Children);

        HashSet<TreeItem> i2Children = new LinkedHashSet<TreeItem>();
        i2Children.add(i3);
        i2.setChildren(i2Children);

//    TreeItem currentSingle = i1;
//    while(currentSingle != null){
//        System.out.println(currentSingle.getData());
//        currentSingle = currentSingle.getChildren();

        public void printTreeItem(TreeItem item){
        System.out.println(item.getData());

        Iterator iterator = item.getChildren().iterator();
        while(iterator.hasNext()){
            printTreeItem((TreeItem)iterator.next());
        }
    }
    }

}
