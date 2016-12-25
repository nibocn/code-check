package me.nibo.codecheck.findbugs;

/**
 * 两个数组对象使用equals方法进行比较, 这是不正确的而应该比较它们的内容是否相等 java.util.Arrays.equals(Object[], Object[])
 *
 * @author nibo
 * @date 2012-12-10
 */
public class EC_BAD_ARRAY_COMPARE {
    public void method() {
        String[] itemStr1 = new String[]{};
        String[] itemStr2 = new String[]{};
        System.out.println(itemStr1.equals(itemStr2));
    }
}
