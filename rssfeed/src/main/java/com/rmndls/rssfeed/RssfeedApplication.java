package com.rmndls.rssfeed;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RssfeedApplication {

	private final RssService rssService;

	public RssfeedApplication(RssService rssService) {
		this.rssService = rssService;
	}

	public static void main(String[] args) {
		SpringApplication.run(RssfeedApplication.class, args);
	}

	public void run(String... args) throws Exception {
		//System.out.println("📰 NYTimes Headlines:");
		//rssService.getHeadlines().forEach(title -> System.out.println(" - " + title));

	}
}
