package com.splitwise;

import com.splitwise.model.Expense;
import com.splitwise.model.Group;
import com.splitwise.service.UserService;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

  public static void main(String[] args) {

    try {
      UserService userService = new UserService();
      userService.registerUser("Gaurav", "Bank of America");
      userService.registerUser("Anish", "Chase");
      userService.registerUser("Atharva", "Chase");
      userService.registerUser("FBI", "Chase");

      Group houseExpense = new Group();
      houseExpense.addToGroup("Gaurav",userService.getUserId("Gaurav"));
      houseExpense.addToGroup("Anish",userService.getUserId("Anish"));
      houseExpense.addToGroup("Atharva",userService.getUserId("Atharva"));
      houseExpense.addToGroup("FBI",userService.getUserId("FBI"));

      Expense laundry = new Expense("Laundry expense",20,"Gaurav");

      laundry.setGroupId(houseExpense);




      //TODO : non uniform split


    } catch (Exception e) {
      System.out.println(e);
    }
  }
}