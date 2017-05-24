package com.TreeList;

import java.util.Set;

/**
 * Created by RENT on 2017-05-24.
 */
public class TreeItem {
    private Set<TreeItem> children;
    private Object data;

    public TreeItem(Object data){
        this.data = data;
    }
    public void setChildren(Set<TreeItem> children){
        this.children = children;
    }
    public Set<TreeItem> getChildren(){
        return this.children;
    }
    public Object getData(){
        return this.data;
    }
}

