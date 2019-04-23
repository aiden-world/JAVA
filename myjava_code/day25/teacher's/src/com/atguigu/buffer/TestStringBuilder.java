package com.atguigu.buffer;

/*
 * java.lang.StringBuilder：
 * （1）一个可变的字符序列。
 * （2）此类提供一个与 StringBuffer 兼容的 API，但不保证同步。
 * 意思：它的方法与StringBuffer一样，不同的时，不保证线程安全
 * 
 * StringBuffer与StringBuilder的区别：
 * StringBuffer是线程安全的，
 * StringBuilder是线程不安全。
 * 
 * 该类被设计用作 StringBuffer 的一个简易替换，用在字符串缓冲区被单个线程使用的时候（这种情况很普遍）。
 * 如果可能，建议优先采用该类，因为在大多数实现中，它比 StringBuffer 要快。 
 * 
 */
public class TestStringBuilder {

}
