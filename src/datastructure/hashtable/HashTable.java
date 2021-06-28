package datastructure.hashtable;

import datastructure.hashtable.Info;

import java.math.BigInteger;

public class HashTable {

	private Info[] arr;

	public HashTable() {
		arr = new Info[100];
	}

	public void insert(Info info){
		arr[hashCode(info.getKey())] = info;
	}

	public Info find(String key){
		return arr[hashCode(key)];
	}

	//哈希化
	//造成问题：取余之后的哈希数会重复
	//解决办法：开放地址法、链地址法
	public int hashCode(String key){

		//用BigInteger类型是幂的连乘产生的数很大
		BigInteger pow27 = new BigInteger("1");
		BigInteger hashVal = new BigInteger("0");
		for(int i=key.length()-1;i>=0;i--){
			//哈希化1：关键字转成ASCll
			int letter = key.charAt(i)-96;
			BigInteger letterB = new BigInteger(String.valueOf(letter));
			//哈希化2：幂的连乘
			hashVal = hashVal.add(letterB.multiply(pow27));
			pow27 = pow27.multiply(new BigInteger(String.valueOf(27)));
		}

		return hashVal.mod(new BigInteger(String.valueOf(arr.length))).intValue();//哈希化3：压缩可选值

	}

	public static void main(String[] args) {

		HashTable tb = new HashTable();
		tb.insert(new Info("assssssssssssssssssssssss","zhangshan"));
		tb.insert(new Info("b","lisi"));
		tb.insert(new Info("ct","wangwu"));

		System.out.println(tb.find("a").getData());
		System.out.println(tb.find("b").getData());
		System.out.println(tb.find("ct").getData());

	}

}
