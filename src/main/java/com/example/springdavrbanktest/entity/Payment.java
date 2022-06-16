package com.example.springdavrbanktest.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
@Column(nullable = false)
    private String name;
@Column(nullable = false)
    private Long sum;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    @ManyToOne
    private PayType payType;
    @ManyToOne
    private Student student;
    @Column(nullable = false)
    private Date created_date;

}
