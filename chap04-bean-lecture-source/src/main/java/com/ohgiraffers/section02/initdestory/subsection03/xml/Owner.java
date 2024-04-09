package com.ohgiraffers.section02.initdestory.subsection03.xml;

import org.springframework.stereotype.Component;



public class Owner {

    /* init-method 랑 같은 어노테이션 설정 방법이다. */

    public void openShop() {
        System.out.println("사장님이 가게를 열었습니다. 이제 쇼핑을 즐겨보세요~~~");
    }

    /* destroy-method 랑 같은 어노테이션 설정 방법이다. */

    public void closeShop() {
        System.out.println("사장님이 가게를 닫았습니다. 이제 쇼핑은 아쉽게도 못하겠네요");
    }


}
