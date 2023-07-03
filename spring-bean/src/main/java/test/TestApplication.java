package test;

import bean.Config;
import bean.User;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionReaderUtils;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.util.StringUtils;

@Import(Config.class)
public class TestApplication {

    public static void main(String[] args) {
        // 创建 BeanFactory 容器
//        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
//        // 注册 Configuration Class（配置类）
//        applicationContext.register(TestApplication.class);
//
//        // 通过 BeanDefinition 注册 API 实现
//        // 1.命名 Bean 的注册方式
//        registerUserBeanDefinition(applicationContext, "mercyblitz-user");
//        // 2. 非命名 Bean 的注册方法
//        registerUserBeanDefinition(applicationContext);
//
//        // 启动 Spring 应用上下文
//        applicationContext.refresh();
//        // 按照类型依赖查找
//        System.out.println("Config 类型的所有 Beans" + applicationContext.getBeansOfType(Config.class));
//        System.out.println("User 类型的所有 Beans" + applicationContext.getBeansOfType(User.class));
//        // 显示地关闭 Spring 应用上下文
//        applicationContext.close();
    }


    public static void registerUserBeanDefinition(BeanDefinitionRegistry registry, String beanName) {
//        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(User.class);
//        beanDefinitionBuilder
//                .addPropertyValue("name", "小马哥");
//
//        // 判断如果 beanName 参数存在时
//        if (StringUtils.hasText(beanName)) {
//            // 注册 BeanDefinition
//            registry.registerBeanDefinition(beanName, beanDefinitionBuilder.getBeanDefinition());
//        } else {
//            // 非命名 Bean 注册方法
//            BeanDefinitionReaderUtils.registerWithGeneratedName(beanDefinitionBuilder.getBeanDefinition(), registry);
//        }
    }

    public static void registerUserBeanDefinition(BeanDefinitionRegistry registry) {
        registerUserBeanDefinition(registry, null);
    }
}
