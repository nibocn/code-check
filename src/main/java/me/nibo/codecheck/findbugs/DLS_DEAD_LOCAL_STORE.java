package me.nibo.codecheck.findbugs;

/**
 * 局部变量赋值,但在其后的没有对它做任何使用
 *
 * @author nibo
 * @date 2012-12-5
 */
public class DLS_DEAD_LOCAL_STORE {
    public void method() {
        Long num = 0l;
        System.out.println("Hello");
    }
}
