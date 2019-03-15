# shell 学习

[参考]: https://tinylab.gitbooks.io/shellbook/content/zh/preface/01-chapter1.html
[调试]: https://www.ibm.com/developerworks/cn/linux/l-cn-shell-debug/index.html
[调试]: http://tinylab.org/bash-debugging-tools/

shell 的 分类

交互式（Interactive）：解释执行用户的命令，用户输入一条命令，Shell就解释执行一条。

批处理（Batch）：用户事先写一个Shell脚本(Script)，其中有很多条命令，让Shell一次把这些命令执行完，而不必一条一条地敲命令

shell中一些比较特殊的变量：

| 特殊变量 | 含义                                                         |
| -------- | ------------------------------------------------------------ |
| $0       | 当前脚本的文件名                                             |
| $n       | 传递给脚本或函数的参数。n 是一个数字，表示第几个参数。例如，第一个参数是$1，第二个参数是$2。 |
| $#       | 传递给脚本或函数的参数个数。                                 |
| $*       | 传递给脚本或函数的所有参数。                                 |
| $@       | 传递给脚本或函数的所有参数。被双引号(" ")包含时，与 $* 稍有不同，下面将会讲到。 |
| ?        | 上个命令的退出状态，或函数的返回值。                         |
| $$       | 当前Shell进程ID。对于 Shell 脚本，就是这些脚本所在的进程ID。 |

Let ????  expr ?? 



Type ???

awk

time ？？？？ 

exit -1

.???



source ..????



说明：如果要查看不同命令的帮助，对于 `let` 和 `type` 等 Shell 内置命令，可以通过 Shell 的一个内置命令 `help` 来查看相关帮助，而一些外部命令可以通过 Shell 的一个外部命令 `man` 来查看帮助，用法诸如 `help let`，`man expr` 等。