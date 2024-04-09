package com.ohgiraffers.section02.initdestory.subsection03.xml;

import com.ohgiraffers.common.Beverage;
import com.ohgiraffers.common.Bread;
import com.ohgiraffers.common.Product;
import com.ohgiraffers.common.ShoppingCart;
import com.ohgiraffers.section02.initdestory.subsection02.annotation.ContextConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context =
                new GenericXmlApplicationContext("section02/initdestroy/subsection03/xml/spring-context.xml");

        String[] beanNames =  context.getBeanDefinitionNames();

        for(String bean : beanNames){
            System.out.println("bean = "+bean);
        }
        Product carpBread = context.getBean("carpBread" , Bread.class);
        Product milk = context.getBean("milk", Beverage.class);
        Product water = context.getBean("water", Beverage.class);

        ShoppingCart cart1 = context.getBean("cart" , ShoppingCart.class);

        cart1.addItem(carpBread);
        cart1.addItem(milk);

        System.out.println("cart1 가지고 있는 상품 : "+cart1.getItems());

        ShoppingCart cart2 = context.getBean("cart" , ShoppingCart.class);
        cart2.addItem(water);

        System.out.println("cart2 가지고 있는 상품 : "+cart2.getItems());

        System.out.println("cart1의 해시코드 : "+cart1.hashCode());
        System.out.println("cart2의 해시코드 : "+cart2.hashCode());


        /* 필기.
        *   init 메소드는 bean 객체 생성 시점에 동작하므로 바로 확인할 수 있지만,
        *   destroy 메소드는 bean 객체 소멸 시점에 동작하므로 컨테이너가 종료 되지
        *   않을 경우 확인할 수 없다.
        *   가비지 컬렉터가 해당 빈을 메모리에서 지울 떄 destory 메소드가 동작하게 되는데
        *   메모리에서 지우기 전에 프로페스는 종료되기 떄문이다.
        *   따라서 close() 메소드로 컨테이너를 강제로 종료시키면 destory 메소드가 동작하게 되는것이다.
        * */

        ((GenericXmlApplicationContext)context).close();

    }

}
