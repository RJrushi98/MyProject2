package collectionPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArryListStudy {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(11);
		al.add(12);
		al.add(13);
		al.add(14);
		
//		System.out.println(al);
//		
//		al.add(1, 20);
//		System.out.println(al);
//		
//		//al.clear();
//		//System.out.println(al);
//
//		Object cloneobj = al.clone();//for creating copy of current arrylist
//		
//	System.out.println(cloneobj);
//	al.add(3, null);
//	System.out.println(al);
//	System.out.println(cloneobj);
//	
//	Object cloneobj1 = al.clone();	
//	System.out.println(cloneobj1);
//	
//	System.out.println(al.contains(30));
//	
//	al.ensureCapacity(2);
//	
//	System.out.println(al.equals(al));
//	System.out.println(al.equals(cloneobj1));
//	System.out.println(al.equals(cloneobj));
//	
//	System.out.println(al.get(3));
//	System.out.println(al.indexOf(null));
	
		
		System.out.println("=================Traversing=======================");
		
		
		System.out.println("=================For loop=======================");
		
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		
		}
		
		System.out.println("=================For each loop=======================");
		
		for(Integer list:al)
		{
			System.out.println(list);
		}
		
		System.out.println("=================Iterator=======================");
		
		Iterator<Integer> obj1 = al.iterator();
		
		while(obj1.hasNext())
		{
			System.out.println(obj1.next());
		}
		
		System.out.println("====================");
		
//		for(int i=4;i<=al.size()-1;i--)
//		{
//			System.out.println(al.get(i));
//		
//		}
		
		ListIterator<Integer> obj2 = al.listIterator();
		while(obj2.hasNext())
		{
			System.out.println(obj2.next());
		}
		System.out.println("====================");
		
		while(obj2.hasPrevious())
		{
			System.out.println(obj2.previous());
		}
		
	}

}
