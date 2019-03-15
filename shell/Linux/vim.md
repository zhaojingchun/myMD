**http://vim-adventures.com/**

模式：

**Normal模式 ： **normal模式下，所有的键就是功能键了。

- `i` → *Insert* 模式，按 `ESC` 回到 *Normal* 模式.
- `x` → 删当前光标所在的一个字符。
- `:wq` → 存盘 + 退出 (`:w` 存盘, `:q` 退出)   （陈皓注：:w 后可以跟文件名）
- `dd` → 删除当前行，并把删除的行存到剪贴板里
- `p` → 粘贴剪贴板

- `hjkl` (强例推荐使用其移动光标，但不必需) →你也可以使用光标键 (←↓↑→). 注: `j` 就像下箭头。

**insert模式**

**命令模式**   所有的命令都需要在Normal模式下使用

- 以 `:` 开始的命令你需要输入 `<enter>`回车，例如 — 如果我写成 `:q` 也就是说你要输入 `:q<enter>`.

1. 各种插入模式

2. ```
   a → 在光标后插入
   o → 在当前行后插入一个新行
   O → 在当前行前插入一个新行
   cw → 替换从光标所在位置后到一个单词结尾的字符
   ```

3. 简单的移动光标

   ```
   0 → 数字零，到行头
   ^ → 到本行第一个不是blank字符的位置（所谓blank字符就是空格，tab，换行，回车等）
   $ → 到本行行尾
   g_ → 到本行最后一个不是blank字符的位置。
   /pattern → 搜索 pattern 的字符串（陈皓注：如果搜索出多个匹配，可按n键到下一个）
   ```

4. 拷贝/粘贴

   ```
   P → 粘贴
   yy → 拷贝当前行当行于 ddP
   ```



下面，让我们看一下vim是怎么重复自己的：

1. `.` → (小数点) 可以重复上一次的命令
2. N<command> → 重复某个命令N次

下面是一个示例，找开一个文件你可以试试下面的命令：

```
2dd → 删除2行
3p → 粘贴文本3次
100idesu [ESC] → 会写下 “desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu desu “
. → 重复上一个命令—— 100 “desu “.
3. → 重复 3 次 “desu” (注意：不是 300，你看，VIM多聪明啊).
```

你要让你的光标移动更有效率，你一定要了解下面的这些命令，**千万别跳过**。

1. N`G` → 到第 N 行 （陈皓注：注意命令中的G是大写的，另我一般使用 : N 到第N行，如 :137 到第137行）

2. `gg` → 到第一行。（陈皓注：相当于1G，或 :1）

3. `G` → 到最后一行。

4. 按单词移动：

   ```
   
   ```

   



