package me.nibo.codecheck;

/**
 * 整型除法强制转换为double或者float类型
 *
 * @author nibo
 * @date 2012-12-10
 */
public class ICAST_IDIV_CAST_TO_DOUBLE {
    public static void method() {
        int x = 1;
        int y = 2;
        double res = x / y;
        System.out.println(res);
    }

    public static void main(String[] args) {
        method();
    }
}
