package me.nibo.codecheck.findbugs;

/**
 * 强制类型转换可能存在失败的情况
 *
 * @author nibo
 * @date 2012-12-10
 */
public class BC_UNCONFIRMED_CAST {
    public void method(Users obj) {
        Teacher users = (Teacher) obj;
        System.out.println(users.getUserName());
    }
}
