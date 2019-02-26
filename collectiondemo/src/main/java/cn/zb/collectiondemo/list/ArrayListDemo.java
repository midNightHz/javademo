package cn.zb.collectiondemo.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * ArrayList是基于数组的一种列表实现 特点 1、查询某一个下标的对象速度非常快 2、删除时特别慢--数组的特性 3、扩容是速度慢--数组的特性
 * 
 * @author chen
 *
 */
public class ArrayListDemo {

	public static void main(String[] args) {
		// 1、list的定义
		// ArrayList的三种构造方法
		List<Integer> list = new ArrayList<Integer>();

		List<Integer> list1 = new ArrayList<>(list);

		List<Integer> list2 = new ArrayList<>(100);

		List<Integer> list3 = new LinkedList<>();
		// list的方法
		for (int i = 0; i < 100; i++) {
			list.add(i + 1);
		}
		list1.add(1000);
		//
		list.addAll(list1);

		System.out.println(list.get(1));
		// contains方法 判断列表中是否有目标对象
		// 前提：、要重写hashcode和equals方法
		System.out.println(list.contains(3));

		list.remove(1);

		list.remove(3);
		
		System.out.println(list);
		
		//1Arraylist和linkedlist的区别
		//1、ArrayList是基于数组的实现，LinkedList是基于链表的实现
		//2、查询制定下标 arrayList要比LinkedList要快
		//

	}

}
