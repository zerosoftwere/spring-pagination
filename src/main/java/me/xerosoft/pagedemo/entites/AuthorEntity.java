package me.xerosoft.pagedemo.entites;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "authors")
public class AuthorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    String name;
}
