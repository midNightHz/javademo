package cn.zb.collectiondemo;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		// 数组的定义

		int[] intArray = { 1, 2, 3 };

		int[] intArray2 = new int[3];

		int[] intArray3 = new int[] { 1, 2, 3 };
		// 2、数据的遍历
		for (int i = 0; i < intArray3.length; i++) {
			System.out.println(i);
		}
		// 3、数组的扩容,数组的扩容方法，新定义一个数组，长度为扩容后的目标长度，然后将原数组的内容复制过去

		int[] inta = new int[6];
		for (int i = 0; i < intArray3.length; i++) {
			inta[i] = intArray3[i];
		}
		intArray3 = inta;

		// 4、数组与其他集合之间的转换
		// 数组的方法很少，是一个基本的数据类型，但是通常很少会用数据，通常会采用其他集合类型
		// JDK对数组的操作进行了封装 java.util.Arrays;
		// 封装了数据的常见操作 数组的复制 数据的扩容，
		// i转换成list
		Arrays.asList(inta);
		// ii数组的复制
		Arrays.copyOf(inta, 50);

		// 5、数组常见的异常 下标越界异常java.lang.ArrayIndexOutOfBoundsException

		int a = inta[100];
		System.out.println(a);

	}

}
