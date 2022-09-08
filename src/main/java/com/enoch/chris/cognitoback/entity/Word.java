package com.enoch.chris.cognitoback.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Table(name="word")
@Getter
@Setter
public class Word {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    
    @Column(name="english")
    private String english;

    @Column(name="spanish")
    private String spanish;

    @Column(name="level")
    private String level;
}
