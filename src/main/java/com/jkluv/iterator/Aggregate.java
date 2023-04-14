package com.jkluv.iterator;

/**
 * 表示集合的接口
 */
public interface Aggregate {
    /**
     * 生成一个遍历集合的迭代器
     * @return
     */
    public abstract Iterator iterator();
}
