package me.nibo.codecheck.findbugs;

/**
 * 对象可能没有重新赋值,并且又在使用此对象的方法或属性
 *
 * @author nibo
 * @date 2012-12-7
 */
public class NP_NULL_ON_SOME_PATH {
    public void method(Users users) {
        if (null == users) {
            System.out.println("用户对象为null");
        }
        //前面判断Users对象为null时打印信息,但这里
        //判断时又在获取Users对象的属性,但此时的Users
        //对象还是为null!
        if ("admin".equals(users.getUserName())) {
            System.out.println("系统管理员");
        }
    }
}
