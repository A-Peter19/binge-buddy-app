package com.example.bingebuddy.service;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

import java.util.List;
import java.util.Map;

@Component
public class TvMazeClient {
  private final RestClient client;
  public TvMazeClient(RestClient client) { this.client = client; }

  // GET https://api.tvmaze.com/search/shows?q={q}
  public List<Map<String, Object>> searchShows(String q) {
    return client.get()
        .uri(uri -> uri.path("/search/shows").queryParam("q", q).build())
        .retrieve()
        .body(new ParameterizedTypeReference<>() {});
  }
}
