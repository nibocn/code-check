package me.nibo.codecheck;

/**
 * 在循环中构建一个StringBuffer(StringBuilder)对象从性能上讲比使用String对象更快
 *
 * @author nibo
 * @date 2012-12-10
 */
public class SBSC_USE_STRINGBUFFER_CONCATENATION {
    public void method() {
        String str = "";
        for (int i = 0; i < 10; i++) {
            str += i;
        }
        System.out.println(str);
    }
}
