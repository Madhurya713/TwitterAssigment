package com.twitter.TwitterAssigment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TwitterService {
   private Twitter twitter;

   @Autowired
   public TwitterService(Twitter twitter) {
       this.twitter = twitter;
   }

   public List<User> searchUsers(String query) {
       return twitter.userOperations().searchForUsers(query);
   }
}
