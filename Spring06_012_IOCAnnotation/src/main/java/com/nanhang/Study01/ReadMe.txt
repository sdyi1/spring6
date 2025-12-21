初识IOC注解之声明Bean的注解
@Component，@Service，@Repository，@Controller

@Service，@Repository，@Controller
这三个底层都
         @AliasFor(
                annotation = Component.class
            )
这使这三个注解实际上等于@Component
这样子的目的是未来代码的可视化