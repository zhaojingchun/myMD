## class

```js
class Point {
  constructor(x, y) { //构造方法
    this.x = x;
    this.y = y;
  }
  //方法之间不用逗号分隔加了会报错
  //this关键字代表实例对象
  toString() {
    return '(' + this.x + ', ' + this.y + ')';
  }
}
```

