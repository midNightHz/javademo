package cn.zb.basetype;

/**
 * java 8种基本类型
 * 
 * @author chen
 *
 */
public class BaseType {

	public static void main(String[] args) {

		int a = 0;
		long b = 0L;
		short c = 0;
		char d = '0';
		float e = 0.0F;
		double f = 0.0;

		boolean g = false;

		byte h = 0;
		// 1、8种基本类型的取值范围
		a = Integer.MAX_VALUE;
		System.out.println("int 类型的最大值:" + a);
		a = Integer.MIN_VALUE;
		System.out.println("int 类型的最小值:" + a);

		b = Long.MAX_VALUE;
		System.out.println("long 类型的最大值:" + b);
		b = Long.MIN_VALUE;
		System.out.println("long 类型的最小值:" + b);

		// 2、基本类型的转换 自动转换 小类型可以直接转化为大类型
		f = e;
		f = b;
		System.out.println(f);
		f = a;
		f = d;
		// 大类型转换为小类型需要强转 强转后会丢失精度
		a=(int) b;
		
		System.out.println(a);

	}

}
