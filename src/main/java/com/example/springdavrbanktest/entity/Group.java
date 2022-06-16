package com.example.springdavrbanktest.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.jdbc.IncorrectResultSetColumnCountException;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "group")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

  private String name;
   @ManyToOne
@JoinColumn(name = "course_id")
private Course course;

   @ManyToOne
    private Teacher teacher;
   @ManyToOne
    private Room room;
private Date start_date;
private Date end_date;

}
