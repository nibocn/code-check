package me.nibo.codecheck.findbugs;

/**
 * 当对象为null时调用对象属性的示例
 *
 * @author nibo
 * @date 2012-12-5
 */
public class NP_LOAD_OF_KNOWN_NULL_VALUE {

    public void method(Users users, boolean flag) {
        if (null == users) {
            if (flag) {
                //users对象还为null就调用getUserName属性了
                System.out.println(users.getUserName());
            }
        }
    }

}
