package com.splitwise.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Group {

  private String groupId;
  private Map<String, User> userMap = new HashMap<>();;

  private Map<String, Double> userContribution = new HashMap<>();


  public void addToGroup(String userId, User user) {
    userMap.putIfAbsent(userId, user);
  }
}
