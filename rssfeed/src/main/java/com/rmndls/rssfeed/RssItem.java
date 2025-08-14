package com.rmndls.rssfeed;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class RssItem {
    private String title;
    private String link;
    private String description;
    private String author;
    private Date publishedDate;
    private List<String> categories;

    public RssItem(String title, String link, String description, String author, Date publishedDate, List<String> categories) {
        this.title = title;
        this.link = link;
        this.description = description;
        this.author = author;
        this.publishedDate = publishedDate;
        //this.categories = categories;
    }
}

