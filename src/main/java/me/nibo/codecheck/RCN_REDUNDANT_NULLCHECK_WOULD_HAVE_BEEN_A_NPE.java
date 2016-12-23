package me.nibo.codecheck;

import java.util.List;

/**
 * 进行对象为空的检查是没用的或检查顺序是错误的
 *
 * @author nibo
 * @date 2012-12-7
 */
public class RCN_REDUNDANT_NULLCHECK_WOULD_HAVE_BEEN_A_NPE {
    public void method() {
        List<String> list = getList();
        //这时获取到的list可能为null,但却直接取它的第1个索引就可能会报错
        String s = list.get(0);
        //取完值再判断list是否为空,其实是没什么意思了
        if (null != list && list.size() > 0) {
            System.out.println(s);
        }
    }

    private List<String> getList() {
        return null;
    }
}
