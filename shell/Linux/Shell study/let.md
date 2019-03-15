[参考]: http://man.linuxde.net/let

**let命令**是bash中用于计算的工具，提供常用运算符还提供了方幂`**`运算符。在变量的房屋计算中不需要加上`$`来表示变量，如果表达式的值是非0，那么返回的状态值是0；否则，返回的状态值是1。

```shell
let arg [arg ...]    #arg代表运算式
```

自加操作`let no++`
自减操作`let no--`
简写形式`let no+=10`，`let no-=20`，分别等同于`let no=no+10，``let no=no-20`