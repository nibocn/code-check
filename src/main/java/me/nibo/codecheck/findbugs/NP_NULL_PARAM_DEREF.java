package me.nibo.codecheck.findbugs;

/**
 * 对参数为null的情况没做处理
 *
 * @author nibo
 * @date 2012-12-7
 */
public class NP_NULL_PARAM_DEREF {

    public void method(Users users) {
        if (null != users) {
            System.out.println(users.getUserName());
        }
        //虽然前面对Users对象是否为null进行了判断,但这里
        //调用printUserInfo方法时又将可能为null的Users对象
        //传入进去了这是不安全的
        printUserInfo(users);
    }

    private void printUserInfo(Users users) {
        System.out.println(users.getId());
        System.out.println(users.getUserName());
    }

}
