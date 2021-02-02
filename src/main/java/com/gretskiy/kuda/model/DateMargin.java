package com.gretskiy.kuda.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
@Entity
@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class DateMargin {
    @Id
    @GeneratedValue
    @JsonIgnore
    private int id;
    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "start_time")
    private Date start;
    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "end_time")
    private Date end;
    @ManyToOne
    private Event event;


}
