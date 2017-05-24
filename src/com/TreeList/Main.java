package com.TreeList;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main {

    public static void main(String[] args) {
	TreeItem i1 = new TreeItem("Kota");
	TreeItem i2 = new TreeItem("Ma");
	TreeItem i3 = new TreeItem("Ala");

        HashSet<TreeItem> i1Children = new HashSet<TreeItem>();
        i1Children.add(i2);
        i1.setChildren(i1Children);

        HashSet<TreeItem> i2Children = new LinkedHashSet<>();
        i2Children.add(i3);
        i2.setChildren(i2Children);

    TreeItem currentSingle = i1;
    while(currentSingle != null){
        System.out.println(currentSingle.getData());
        currentSingle = currentSingle.getChildren();
    }
    }

}
