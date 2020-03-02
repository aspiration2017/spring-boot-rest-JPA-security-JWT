package com.example.spring.rest.security.user;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "table_name")
public class Demo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; // use 'Integer' not 'int'
    @Column(name = "column_name")
    private String column;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER) // fetch default is LAZY
    @JoinTable(
            name = "table_name",
            joinColumns = { @JoinColumn(name = "this_foreign_key") },
            inverseJoinColumns = { @JoinColumn(name = "other_foreign_key") })
    private List<Role> roles;



}
