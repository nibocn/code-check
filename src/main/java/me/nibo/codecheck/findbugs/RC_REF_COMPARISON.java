package me.nibo.codecheck.findbugs;

/**
 * 相同类型的对象比较值是否相等时使用equals方法来比较而不是==
 *
 * @author nibo
 * @date 2012-12-7
 */
public class RC_REF_COMPARISON {
    public void method() {
        Long num1 = 8888l;
        Long num2 = 9999l;
        if (num1 == num2) {
            System.out.println("True");
        }
    }
}
