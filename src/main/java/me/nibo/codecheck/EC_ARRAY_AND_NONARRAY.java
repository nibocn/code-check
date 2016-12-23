package me.nibo.codecheck;

/**
 * 数组对象使用equals方法和非数组对象进行比较, 即使比较的双方都是数组对象也不应该使用equals方法, 而应该比较它们的
 * 内容是否相等使用 java.util.Arrays.equals(Object[], Object[])
 *
 * @author nibo
 * @date 2012-12-10
 */
public class EC_ARRAY_AND_NONARRAY {
    public void method() {
        String[] itemStr1 = new String[]{};
        int i = 0;
        String str = "";
        System.out.println(itemStr1.equals(str));
    }
}
