package com.example.demo1;

import com.example.demo2.entities.Member;
import com.example.demo2.services.MemberService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author kurakuraninja
 * @since 29/03/23
 */
@SpringBootTest
public class MemberServiceTest {

    @Autowired
    private MemberService memberService;

    @Test
    public void testSave(){
        Member member = Member.builder()
                .name("Hamka")
                .build();

        final Member save = memberService.save(member);

        Assertions.assertEquals(member.getName(),save.getName());
    }
}
