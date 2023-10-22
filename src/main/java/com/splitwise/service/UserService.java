package com.splitwise.service;

import com.splitwise.exception.UserAlreadyExistsException;
import com.splitwise.exception.UserNotFoundException;
import com.splitwise.model.Group;
import com.splitwise.model.User;
import com.splitwise.repository.GlobalUserRepo;

public class UserService {

  public void registerUser(String userName, String bankDetail) throws UserAlreadyExistsException {
    User newUser = new User(userName, bankDetail);
    if (GlobalUserRepo.userHashMap.containsKey(userName)) {
      throw new UserAlreadyExistsException("User: " + userName + " already exists");
    }

    GlobalUserRepo.userHashMap.put(userName, newUser);

  }

  public User getUserId(String userName) throws UserNotFoundException {

    if (!GlobalUserRepo.userHashMap.containsKey(userName)) {
      throw new UserNotFoundException("User: " + userName + " not found");
    }
    return GlobalUserRepo.userHashMap.get(userName);
  }


}
