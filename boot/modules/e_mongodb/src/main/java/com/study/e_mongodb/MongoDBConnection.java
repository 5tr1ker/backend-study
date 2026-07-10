package com.study.e_mongodb;

import org.springframework.stereotype.Component;

@Component
public class MongoDBConnection {

    private MemberRepository memberRepository;

    public MongoDBConnection(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public void connectionTest() {
        memberRepository.save(new Member("홍길동", 30));

        Member member = memberRepository.findByName("홍길동")
                .orElseThrow();

        System.out.println(member.toString());
    }

}
