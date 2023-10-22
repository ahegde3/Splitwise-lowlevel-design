package com.splitwise.repository;

import com.splitwise.model.User;
import java.util.HashMap;
import java.util.Map;

//Explore Singleton pattern.
public class GlobalUserRepo {

  public static Map<String, User> userHashMap = new HashMap<>();
}
