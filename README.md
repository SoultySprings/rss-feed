# 📰 RSS Feed Aggregator — Spring Boot REST API

A Spring Boot REST service that fetches, parses, and serves RSS/Atom feeds using [Rome](https://rometools.github.io/rome/).
It exposes simple endpoints like:

```
GET /api/{source}/{channel}
```

Example: `GET /api/nytimes/homepage` — returns parsed items from the NYTimes homepage feed as JSON.

---

## ✨ Features

* 🔗 Fetches and parses remote RSS/Atom feeds into JSON
* 🛠 Exposes simple REST endpoints (`/api/{source}/{channel}`)
* 🧩 Configurable sources directly in the controller
* ⚠️ Basic error handling for feed not found, parsing errors, and upstream issues
* ✏️ Uses Lombok to reduce boilerplate code

---

## 🚀 Getting Started

### Prerequisites

* Java 17+ ☕
* Maven 3.6+ 📦
* IDE with Lombok plugin installed ✨

### Dependencies (`pom.xml`)

Rome (com.rometools:rome:1.18.0) 🔗 — for parsing RSS/Atom feeds

Lombok (org.projectlombok:lombok:1.18.30) ✏️ — to reduce boilerplate code

Spring Boot Test (org.springframework.boot:spring-boot-starter-test) 🧪 — for unit and integration testing

### Build and Run

```bash
mvn clean package -DskipTests
java -jar target/rss-aggregator-0.0.1-SNAPSHOT.jar
```

---

## 🌐 API

### `GET /api/{source}/{channel}`

* Returns parsed feed items for the specified source and channel.
* Example: `GET /api/nytimes/homepage`
* Feed URLs are defined directly in the `@GetMapping` methods in the controller.

**Optional query parameters:**

* `limit` — number of items to return (`?limit=10`)
* `since` — ISO date to filter items published after (`?since=2025-01-01T00:00:00Z`)

**Responses:**

* ✅ `200 OK` — JSON array of feed items
* ⚠️ `404 Not Found` — source/channel not configured
* 🚨 `502 Bad Gateway` — upstream feed unreachable or invalid
* ❌ `500 Internal Server Error` — unexpected error

---

## 📄 Example Response

```json
[
  {
    "title": "Example article title",
    "link": "https://example.com/article",
    "description": "Short summary or HTML description",
    "publishedDate": "2025-08-14T09:15:00Z",
    "author": "Author Name",
    "categories": ["World", "Politics"],
    "source": "nytimes",
    "channel": "homepage"
  }
]
```

---

## 🛠 Development Notes

* Use `SyndFeedInput` from Rome to parse feeds
* Map `SyndEntry` to a DTO (`FeedItemDto`) using Lombok
* Consider caching feeds to reduce repeated HTTP calls
* Handle `IOException` and `FeedException` gracefully

### Example DTO

```java
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FeedItemDto {
    private String title;
    private String link;
    private String description;
    private Instant publishedDate;
    private String author;
    private List<String> categories;
    private String source;
    private String channel;
}
```

---

## 🧪 Testing

```bash
mvn test
```

* Use `spring-boot-starter-test` with mocks for HTTP responses

---

## 💻 Example Usage

```bash
curl -s "http://localhost:8080/api/nytimes/homepage" | jq
```

---

## 🌟 Suggestions & Improvements

* 🗄 Add caching with TTL to reduce upstream requests
* 🔒 Add authentication for private feeds
* ⏰ Implement scheduled background feed refresh
* 📜 Add filtering and pagination

---
