package com.example.bingebuddy.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.bingebuddy.service.TvMazeClient;

@RestController
@RequestMapping("/api/shows")
public class ShowController {
  private final TvMazeClient tv;
  public ShowController(TvMazeClient tv) { this.tv = tv; }

  @GetMapping("/search")
  public List<Map<String, Object>> search(@RequestParam String q) {
    return tv.searchShows(q);
  }
}
