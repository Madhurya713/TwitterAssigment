package com.twitter.TwitterAssigment.controller;

import com.twitter.TwitterAssigment.service.TwitterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.social.twitter.api.TwitterProfile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tweets")
public class TweetController {
   private TwitterService twitterService;

   @Autowired
   public TweetController(TwitterService twitterService) {
       this.twitterService = twitterService;
   }

   @GetMapping("/users/search")
   public ResponseEntity<List<TwitterProfile>> searchUsers(@RequestParam String query) {
       List<TwitterProfile> users = twitterService.searchUsers(query);
       return ResponseEntity.ok(users);
   }
}
