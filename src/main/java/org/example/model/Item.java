package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "subject")
    private String subject;

    @Column(name = "image1", columnDefinition = "TEXT")
    private String image1;
    @Column(name = "image2", columnDefinition = "TEXT")
    private String image2;
    @Column(name = "image3", columnDefinition = "TEXT")
    private String image3;

    @Column(name = "grade")
    private short grade;
    @Column(name = "from_user_id")
    private long user_id;

    @Column(name = "recognized_text", columnDefinition = "TEXT")
    private String recognized_text;

    @Column(name = "school")
    private int school;
}