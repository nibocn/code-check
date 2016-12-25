package me.nibo.codecheck.findbugs;

/**
 * 调用equals的对象可能为null
 *
 * @author nibo
 * @date 2012-12-10
 */
public class EC_NULL_ARG {
    public void method(String str) {
        //传入方法equals()的参数值是null 的情况下,
        //结果肯定 是false,这种情况下,使用方法equals()没有意义
        System.out.println(str.equals(null));
    }

}
