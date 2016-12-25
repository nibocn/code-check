package me.nibo.codecheck.findbugs;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 方法获得了当前的对象锁,但是在所有的异常处理中始终没有释放它
 *
 * @author nibo
 * @date 2012-12-10
 */
public class UL_UNRELEASED_LOCK_EXCEPTION_PATH {
    private static final ReentrantReadWriteLock LOCK = new ReentrantReadWriteLock();

    public void method() {
        // 从此处的代码来看有考虑到对于锁的释放但是从开始加锁的地方并没有包括到try方法块中,
        // 这就会造成如果在执行下一句创建集合对象失败那抛出的异常将不能被捕获相应的finally也
        // 不会被执行,虽然这里看起来创建一个对象一般都不会有失败但从代码规范和一些我们还无法预
        // 知的情况来看这样的写法确实有问题
        LOCK.readLock().lock();
        List<Users> listUsers = new ArrayList<Users>();
        try {
            listUsers.add(new Users());
            System.out.println("Hello");
        } finally {
            LOCK.readLock().unlock();
        }
    }
}
