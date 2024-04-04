package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.Account;
import com.ohgiraffers.common.MemberDTO;
import com.ohgiraffers.common.PersonalAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    @Bean
    public Account account(){
      return new PersonalAccount(10,"111-1234-12341234");
    }
    @Bean
    public MemberDTO getMember() {
        /* 생성자를 통한 주입 */
//        return new MemberDTO(1,"이지은","010-1111-1111","lee@gmail.com",account());

        /* setter 주입 */
        MemberDTO member = new MemberDTO();
        member.setSequence(1);
        member.setName("이지은");
        member.setPhone("010-1111-1111");
        member.setEmail("lee@gmail.com");
        member.setPersonalAccount(account());

        return member;
    }

}
