package com.splitwise.model;

import java.time.LocalDate;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {


   private String userId;
   private String userName;
   private String bankDetails;

   private LocalDate dateOfJoining;

   public User(String userName,String bankDetails){
      this.userName =userName;
      this.bankDetails =bankDetails;
      this.dateOfJoining = LocalDate.now();
      this.userId =  UUID.randomUUID().toString();
   }


}
