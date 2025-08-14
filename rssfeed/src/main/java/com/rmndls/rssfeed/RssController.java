package com.rmndls.rssfeed;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RssController {

    private final RssService rssService;

    public RssController(RssService rssService) {
        this.rssService = rssService;
    }

    // General News
    @GetMapping("/headlines/nytimes/homepage")
    public List<RssItem> getHomePage() {
        return rssService.getAllFeedItems("https://rss.nytimes.com/services/xml/rss/nyt/HomePage.xml");
    }

    @GetMapping("/headlines/nytimes/world")
    public List<RssItem> getWorld() {
        return rssService.getAllFeedItems("https://rss.nytimes.com/services/xml/rss/nyt/World.xml");
    }

    @GetMapping("/headlines/nytimes/us")
    public List<RssItem> getUS() {
        return rssService.getAllFeedItems("https://rss.nytimes.com/services/xml/rss/nyt/US.xml");
    }

//    @GetMapping("/headlines/nytimes/newyork")
//    public List<RssItem> getNewYork() {
//        return rssService.getAllFeedItems("https://rss.nytimes.com/services/xml/rss/nyt/NewYork.xml");
//    }

    @GetMapping("/headlines/nytimes/politics")
    public List<RssItem> getPolitics() {
        return rssService.getAllFeedItems("https://rss.nytimes.com/services/xml/rss/nyt/Politics.xml");
    }

    @GetMapping("/headlines/nytimes/business")
    public List<RssItem> getBusiness() {
        return rssService.getAllFeedItems("https://rss.nytimes.com/services/xml/rss/nyt/Business.xml");
    }

        @GetMapping("/headlines/nytimes/technology")
    public List<RssItem> getTechnology() {
        return rssService.getAllFeedItems("https://rss.nytimes.com/services/xml/rss/nyt/Technology.xml");
    }

    @GetMapping("/headlines/nytimes/science")
    public List<RssItem> getScience() {
        return rssService.getAllFeedItems("https://rss.nytimes.com/services/xml/rss/nyt/Science.xml");
    }

    @GetMapping("/headlines/nytimes/health")
    public List<RssItem> getHealth() {
        return rssService.getAllFeedItems("https://rss.nytimes.com/services/xml/rss/nyt/Health.xml");
    }

    @GetMapping("/headlines/nytimes/education")
    public List<RssItem> getEducation() {
        return rssService.getAllFeedItems("https://rss.nytimes.com/services/xml/rss/nyt/Education.xml");
    }

    @GetMapping("/headlines/nytimes/arts")
    public List<RssItem> getArts() {
        return rssService.getAllFeedItems("https://rss.nytimes.com/services/xml/rss/nyt/Arts.xml");
    }

    @GetMapping("/headlines/nytimes/opinion")
    public List<RssItem> getOpinion() {
        return rssService.getAllFeedItems("https://rss.nytimes.com/services/xml/rss/nyt/Opinion.xml");
    }

    @GetMapping("/headlines/nytimes/editorials")
    public List<RssItem> getEditorials() {
        return rssService.getAllFeedItems("https://rss.nytimes.com/services/xml/rss/nyt/Editorials.xml");
    }

//    @GetMapping("/headlines/nytimes/oped")
//    public List<RssItem> getOpEd() {
//        return rssService.getAllFeedItems("https://rss.nytimes.com/services/xml/rss/nyt/OpEd.xml");
//    }

    @GetMapping("/headlines/nytimes/upshot")
    public List<RssItem> getUpshot() {
        return rssService.getAllFeedItems("https://rss.nytimes.com/services/xml/rss/nyt/Upshot.xml");
    }

    // Lifestyle & Culture
    @GetMapping("/headlines/nytimes/style")
    public List<RssItem> getStyle() {
        return rssService.getAllFeedItems("https://rss.nytimes.com/services/xml/rss/nyt/Style.xml");
    }

//    @GetMapping("/headlines/nytimes/food")
//    public List<RssItem> getFood() {
//        return rssService.getAllFeedItems("https://rss.nytimes.com/services/xml/rss/nyt/Food.xml");
//    }

    @GetMapping("/headlines/nytimes/travel")
    public List<RssItem> getTravel() {
        return rssService.getAllFeedItems("https://rss.nytimes.com/services/xml/rss/nyt/Travel.xml");
    }

    @GetMapping("/headlines/nytimes/realestate")
    public List<RssItem> getRealEstate() {
        return rssService.getAllFeedItems("https://rss.nytimes.com/services/xml/rss/nyt/RealEstate.xml");
    }

//    @GetMapping("/headlines/nytimes/wellness")
//    public List<RssItem> getWellness() {
//        return rssService.getAllFeedItems("https://rss.nytimes.com/services/xml/rss/nyt/Wellness.xml");
//    }

//    @GetMapping("/headlines/nytimes/lifestyle")
//    public List<RssItem> getLifestyle() {
//        return rssService.getAllFeedItems("https://rss.nytimes.com/services/xml/rss/nyt/Lifestyle.xml");
//    }

//    @GetMapping("/headlines/nytimes/popculture")
//    public List<RssItem> getPopCulture() {
//        return rssService.getAllFeedItems("https://rss.nytimes.com/services/xml/rss/nyt/PopCulture.xml");
//    }

    @GetMapping("/headlines/nytimes/television")
    public List<RssItem> getTelevision() {
        return rssService.getAllFeedItems("https://rss.nytimes.com/services/xml/rss/nyt/Television.xml");
    }

    @GetMapping("/headlines/nytimes/music")
    public List<RssItem> getMusic() {
        return rssService.getAllFeedItems("https://rss.nytimes.com/services/xml/rss/nyt/Music.xml");
    }

    @GetMapping("/headlines/nytimes/movies")
    public List<RssItem> getMovies() {
        return rssService.getAllFeedItems("https://rss.nytimes.com/services/xml/rss/nyt/Movies.xml");
    }

    // Specialized & Emerging Topics
    @GetMapping("/headlines/nytimes/climate")
    public List<RssItem> getClimate() {
        return rssService.getAllFeedItems("https://rss.nytimes.com/services/xml/rss/nyt/Climate.xml");
    }

    @GetMapping("/headlines/nytimes/ai")
    public List<RssItem> getAI() {
        return rssService.getAllFeedItems("https://rss.nytimes.com/services/xml/rss/nyt/ArtificialIntelligence.xml");
    }

//    @GetMapping("/headlines/nytimes/weather")
//    public List<RssItem> getWeather() {
//        return rssService.getAllFeedItems("https://rss.nytimes.com/services/xml/rss/nyt/Weather.xml");
//    }
}
