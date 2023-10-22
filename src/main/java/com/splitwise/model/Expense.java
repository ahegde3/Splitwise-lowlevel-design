package com.splitwise.model;

import java.util.UUID;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Expense {

  private String expenseId;
  private ExpenseStatus status;

  private Group groupId;

  private double totalCost;
  private String description;
  private String createdBy;

  public Expense(String description, double totalCost,String createdBy)

  {
    this.description = description;
    this.totalCost = totalCost;
    this.status = ExpenseStatus.CREATED;
    this.expenseId = UUID.randomUUID().toString();
    this.createdBy = createdBy;
  }

}
