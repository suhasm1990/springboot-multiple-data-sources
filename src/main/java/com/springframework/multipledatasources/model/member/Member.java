package com.springframework.multipledatasources.model.member;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Membership")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String memberId;
}
