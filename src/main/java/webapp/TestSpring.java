package webapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        TeasBean teasBean = context.getBean("testBean", TeasBean.class);

        System.out.println(teasBean.getName());
    }
}
