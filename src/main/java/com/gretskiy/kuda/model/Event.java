package com.gretskiy.kuda.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Clob;
import java.util.Date;
import java.util.Set;

@Entity(name = "events")
@Getter
@Setter
@NoArgsConstructor
public class Event {
    @GeneratedValue
    @Id
    private long id;

    @Column(name = "publication_date")
    @Temporal(
            TemporalType.DATE
    )
    private Date publishDate;

    @ElementCollection
    @Column(name = "dates")
    @Temporal(TemporalType.DATE)
    private Set<Date> dates;

    @Column(name = "title")
    private String title;

    @Column(name = "short_title")
    private String shortTitle;

    @Column(name = "slug")
    private String readableURL;

    @Column(name = "place")
    private String place;

    @Column(name = "description")
    private String description;

    @Column(name = "body_text")
    @Lob
    private Clob fullDescription;

    @Column(name = "location")
    private String city;

    @ElementCollection
    @Column(name = "categories")
    private Set<String> categories;

    @Column(name = "tagline")
    private String tagLine;

    @Column(name = "age_restriction")
    private int ageRestriction;

    @Column
    private long price;

    @Column(name = "is_free")
    private boolean isFree;

    @Column(name = "images")
    @OneToMany
    private Set<Image> images;

    @Column(name = "favorites_count")
    private long favoritesCount;

    @Column(name = "comments_count")
    private long commentsCount;

    @Column(name = "site_url")
    private String siteURL;

    @Column(name = "tags")
    @ElementCollection
    private Set<String> tags;

    @Column(name = "participants")
    @OneToMany
    private Set<Participant> participants;




}
