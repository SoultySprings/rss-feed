package com.rmndls.rssfeed;

import com.rometools.rome.feed.synd.SyndCategory;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;
import org.springframework.stereotype.Service;

import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RssService {

    public List<RssItem> getAllFeedItems(String Rss) {
        try {
            URL feedSource = new URL(Rss);
            SyndFeedInput input = new SyndFeedInput();
            SyndFeed feed = input.build(new XmlReader(feedSource));

            return feed.getEntries().stream()
                    .map(entry -> new RssItem(
                            entry.getTitle(),
                            entry.getLink(),
                            entry.getDescription() != null ? entry.getDescription().getValue() : "",
                            entry.getAuthor(),
                            entry.getPublishedDate(),
                            entry.getCategories().stream().map(SyndCategory::getName).toList()
                    ))
                    .collect(Collectors.toList());

        } catch (Exception e) {
            throw new RuntimeException("Failed to fetch RSS feed", e);
        }
    }
}
