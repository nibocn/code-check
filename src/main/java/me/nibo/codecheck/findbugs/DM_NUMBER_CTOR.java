package me.nibo.codecheck.findbugs;

import java.util.HashMap;
import java.util.Map;

/**
 * 当值介于-127~127时使用Integer.valueOf()比new Integer()效率更高(大约快3.5倍), 包括(Long, Integer, Short, Character, Byte)
 *
 * @author nibo
 * @date 2012-12-10
 */
public class DM_NUMBER_CTOR {
    public void method(int value) {
        Map<Long, Integer> map = new HashMap<Long, Integer>();
        map.put(0l, new Integer(value));
    }
}
