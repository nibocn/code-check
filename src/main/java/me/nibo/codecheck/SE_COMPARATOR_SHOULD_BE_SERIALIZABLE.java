package me.nibo.codecheck;

import java.util.Comparator;

/**
 * Comparator接口没有实现Serializable接口
 *
 * @author nibo
 * @date 2012-12-7
 */
public class SE_COMPARATOR_SHOULD_BE_SERIALIZABLE implements Comparator<Object> {

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }

}
