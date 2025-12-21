package com.nanhang.Study03.Bean;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2025/12/13
 * @ClassName A
 */
@Component
public class A {
    public A() {
        System.out.println("A的空参构造执行");
    }
}
@Controller
class B{
    public B() {
        System.out.println("B的空参构造执行");
    }

}
@Service
class C{
    public C() {
        System.out.println("C的空参构造执行");
    }
}
@Repository
class D {
    public D() {
        System.out.println("D的空参构造执行");
    }
}
@Repository
class E {
    public E() {
        System.out.println("E的空参构造执行");
    }
}


