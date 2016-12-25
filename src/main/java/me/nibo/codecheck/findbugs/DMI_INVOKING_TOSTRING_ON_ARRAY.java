package me.nibo.codecheck.findbugs;


/**
 * 调用数组的toString()方法,产生的结果形如[@ 16f0472并不能显示数组的真实内容
 *
 * @author nibo
 * @date 2012-12-7
 */
public class DMI_INVOKING_TOSTRING_ON_ARRAY {
    public String method() {
        int[] itemNum = new int[]{1, 2};
        //数组直接toString(),必须明确代码中确实需要这样?
        //因为这样并不是得到数组的真正内容
        return itemNum + "";
    }
}
