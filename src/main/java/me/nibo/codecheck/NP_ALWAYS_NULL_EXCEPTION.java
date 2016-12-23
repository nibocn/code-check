package me.nibo.codecheck;

/**
 * 空指针引用上调用去除引用方法，将发生空指针异常
 *
 * @author nibo
 * @date 2012-12-7
 */
public class NP_ALWAYS_NULL_EXCEPTION {
    public void method() {
        Users users = null;
        try {
            //此处如果发生异常,user对象为null,最终执行finally时就会报空指针异常
            users = new Users();
        } catch (Exception e) {
            System.out.println("异常!");
        } finally {
            users.close();
        }
    }

}
