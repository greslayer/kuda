package com.gretskiy.kuda.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.sql.Clob;
import java.util.Date;
import java.util.Set;

@Entity(name = "events")
@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Event {
    @Id
    @GeneratedValue
    @JsonProperty(value = "databaseId")
    private long id;

    @Column(name = "event_id")
    @JsonProperty(value = "id")
    private long eventId;

    @Column(name = "publication_date")
    @Temporal(
            TemporalType.DATE
    )
    private Date publishDate;

    @OneToMany(fetch = FetchType.LAZY)
    @Column
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    @JoinColumn(name = "id")
    private Set<DateMargin> dates;
    //TODO DateMargin.event = null
    //TODO возвращаются странные штампы

    @Column(name = "title")
    private String title;

    @Column(name = "short_title")
    private String shortTitle;

    @Column(name = "slug")
    private String slug;

    @Column(name = "place")
    @JsonIgnore
    private String place;

    @Column(name = "description", length = 1000)
    private String description;

    @Column(name = "body_text")
    @Lob
    private String fullDescription;

    @Column(name = "location")
    @JsonIgnore
    private String city;

    @ElementCollection
    @Column(name = "categories")
    private Set<String> categories;

    @Column(name = "tagline")
    private String tagLine;

    @Column(name = "age_restriction")
    @JsonProperty(value = "age_restriction")
    private String ageRestriction;

    @Column(name = "price")
    private String price;

    @Column(name = "is_free")
    @JsonProperty(value = "is_free")
    private boolean isFree;

    @Column(name = "images")
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "event")
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private Set<Image> images;

    @Column(name = "favorites_count")
    @JsonProperty(value = "favorites_count")
    private long favoritesCount;

    @Column(name = "comments_count")
    @JsonProperty(value = "comments_count")
    private long commentsCount;

    @Column(name = "site_url")
    @JsonProperty(value = "site_url")
    private String siteURL;

    @Column(name = "tags")
    @ElementCollection
    private Set<String> tags;

}
