package datastructure.hashtable;


import datastructure.hashtable.Info;

import java.math.BigInteger;

public class HashTable2 {

	private Info[] arr;

	public HashTable2() {
		arr = new Info[100];
	}

	public void insert(Info info){
		arr[hashCode(info.getKey())] = info;
	}

	public Info find(String key){
		return arr[hashCode(key)];
	}

	public int hashCode(String key){
		//用BigInteger类型是幂的连乘产生的数很大
		BigInteger pow27 = new BigInteger("1");
		BigInteger hashVal = new BigInteger("0");
		for(int i=key.length()-1;i>=0;i--){
			int letter = key.charAt(i)-96;
			BigInteger letterB = new BigInteger(String.valueOf(letter));
			hashVal = hashVal.add(letterB.multiply(pow27));
			pow27 = pow27.multiply(new BigInteger(String.valueOf(27)));
		}

		return hashVal.mod(new BigInteger(String.valueOf(arr.length))).intValue();

	}

	public static void main(String[] args) {

		HashTable2 tb = new HashTable2();
		tb.insert(new Info("assssssssssssssssssssssss","zhangshan"));
		tb.insert(new Info("b","lisi"));
		tb.insert(new Info("ct","wangwu"));

		System.out.println(tb.find("a").getData());
		System.out.println(tb.find("b").getData());
		System.out.println(tb.find("ct").getData());

	}

}
