package com.jkluv.iterator;

/**
 * 遍历集合的接口
 * Iterator用于遍历集合中的元素
 */
public interface Iterator {
    /**
     * 判断是否存在下一个元素
     * @return
     */
    public abstract boolean hasNext();
    
    /**
     * 获取下一个元素
     * @return
     */
    public abstract Object next();
}
