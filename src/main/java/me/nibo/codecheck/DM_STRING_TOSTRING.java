package me.nibo.codecheck;

/**
 * 调用String.toString()是多余的操作,只要使用String就可以了示例
 *
 * @author nibo
 * @date 2012-12-5
 */
public class DM_STRING_TOSTRING {
    public String method() {
        String str = "";
        //变量str为字符串类型不需要再toString()
        return str.toString();
    }
}
