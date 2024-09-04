package com.chienpd.learning.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class UserEntity {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;
}
