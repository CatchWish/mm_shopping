Iterator(迭代子)模式：
迭代子模式可以顺序访问一个聚集中的元素而不必暴露聚集的内部表象。多个对象聚在一起形成的总体称之为聚集，
聚集对象是能够包容一组对象的容器对象。迭代子模式将迭代逻辑封装到一个独立的子对象中，从而与聚集本身隔开。
迭代子模式简化了聚集的界面。每一个聚集对象都可以有一个或一个以上的迭代子对象，每一个迭代子的迭代状态可以是彼此独立的。
迭代算法可以独立于聚集角色变化。

迭代器（Iterator）模式，又叫做游标（Cursor）模式。GOF给出的定义为：
提供一种方法访问一个容器（container）对象中各个元素，而又不需暴露该对象的内部细节。

1) 迭代器角色（Iterator）：迭代器角色负责定义访问和遍历元素的接口。
2) 具体迭代器角色（Concrete Iterator）：具体迭代器角色要实现迭代器接口，并要记录遍历中的当前位置。
3) 容器角色（Container）：容器角色负责提供创建具体迭代器角色的接口。
4) 具体容器角色（Concrete Container）：具体容器角色实现创建具体迭代器角色的接口——这个具体迭代器角色于该容器的结构相关。
