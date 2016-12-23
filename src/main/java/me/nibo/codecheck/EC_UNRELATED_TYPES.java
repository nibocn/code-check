package me.nibo.codecheck;

/**
 * 调用equals方法比较不同类型的类 示例
 *
 * @author nibo
 * @date 2012-12-5
 */
public class EC_UNRELATED_TYPES {
    public void method() {
        String str = "";
        Long num = 0L;
        System.out.println(str.equals(num));
    }
}
