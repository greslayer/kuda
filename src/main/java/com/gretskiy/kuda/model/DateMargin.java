package com.gretskiy.kuda.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class DateMargin {
    @Id
    private long id;
    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "from_date")
    private Date fromDate;
    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "to_date")
    private Date toDate;
    @ManyToOne
    private Event event;
}
