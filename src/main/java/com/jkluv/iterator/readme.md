### 迭代器模式

* Iterator（迭代器）：负责定义按照顺序逐个遍历元素的接口（API）
* ConcreteIterator（具体的迭代器）：该角色负责实现Iterator角色所定义的接口（API）。BookShelfIterator类。
* Aggregate（集合）：该角色负责定义创建Iterator角色的接口（API）。这个接口是一个方法，会创建出“按顺序访问保存在我内部元素的人”。
* ConcreteAggregate（具体的集合）：该角色负责实现Aggregate角色所定义的接口。它会创建出具体的Iterator角色，即ConcreteIterator角色。BookShelf类。

![image-20230414234934406](http://image.jkluv.com/note/image-20230414234934406.png)