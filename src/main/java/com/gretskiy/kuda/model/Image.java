package com.gretskiy.kuda.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Clob;

@Entity(name = "images")
@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Image {
    @Id
    @JsonIgnore
    @GeneratedValue
    private Long id;
    @ManyToOne
    private Event event;
    @Column(name = "image_url")
    private String image;
}
