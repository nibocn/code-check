package me.nibo.codecheck;

/**
 * 对象赋为null值后,没有被重新赋值的示例
 *
 * @author nibo
 * @date 2012-12-5
 */
public class NP_ALWAYS_NULL {
    public void method() {
        //对象为null
        Users users = null;
        //为null就直接获取对象的getId属性
        int id = users.getId();
        System.out.println(id);
    }
}
