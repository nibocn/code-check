package me.nibo.codecheck.findbugs;

/**
 * 用==或者!=方法去比较String类型的参数
 *
 * @author nibo
 * @date 2012-12-10
 */
public class ES_COMPARING_PARAMETER_STRING_WITH_EQ {
    public void method(String str1, String str2) {
        System.out.println(str1 == str2);
    }
}
