package me.nibo.codecheck.findbugs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 当遍历Map类型时，使用entrySet的迭代器比使用keySet的迭代器效率要高
 *
 * @author nibo
 * @date 2012-12-10
 */
public class WMI_WRONG_MAP_ITERATOR {
    public void method() {
        Map<Long, String> map = new HashMap<Long, String>();
        map.put(0l, "abc");
        map.put(1l, "abc");
        map.put(2l, "abc");
        Set<Long> keys = map.keySet();
        Iterator<Long> iKeys = keys.iterator();
        Long key = null;
        while (iKeys.hasNext()) {
            key = iKeys.next();
            System.out.println(map.get(key));
        }
    }

    /**
     * 通过entrySet遍历Map
     */
    public void method2() {
        Map<Long, String> map = new HashMap<Long, String>();
        map.put(0l, "abc");
        map.put(1l, "abc");
        map.put(2l, "abc");
        for (Map.Entry<Long, String> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
