Proxy.newProxyInstance 方法返回的是代理类对象默认类型是Object，我们需要强转成代理类的接口类型
（JDK 动态代理只能转换为接口类型，不能转换为具体实现类类型）

Proxy.newProxyInstance 的前两个参数 获取 目标类类加载器 和 获取目标类接口 都是通过目标类去获取
 直接使用 接口.class.getInterfaces会报错
        理解 当使用 接口.class.getInterfaces() 时，你会得到一个空数组，因为接口本身不"实现"其他接口，而是可能"扩展"其他接口。对于接口，正确的获取其自身类型的方法是直接使用 接口.class。

 接口.class也不行 ，  Proxy.newProxyInstance  的第二个参数需要的是一个接口数组，单个接口不符合


