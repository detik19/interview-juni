package com.nostratech.collections;

public interface List {
	
	public boolean add(Object o);
	public boolean add(int index, Object o);
	public void clear();
	public Object get(int index);
	public int size();
	public Object remove(int index);
	public String toStr();
	public void leftRotate(int iteration);

}
