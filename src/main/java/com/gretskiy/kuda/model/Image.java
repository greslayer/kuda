package com.gretskiy.kuda.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Clob;

@Entity(name = "images")
@Getter
@Setter
@NoArgsConstructor
public class Image {
    @Id
    private Long id;
    @ManyToOne
    private Event event;
    @Column(name = "image")
    @Lob
    private Clob image;
}
