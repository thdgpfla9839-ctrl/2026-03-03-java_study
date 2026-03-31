package com.sist.customer;

import lombok.Data;
import lombok.Getter;

@Data
public class CustomerVO {
  private String customer_id;
  private String login_id;
  private String pwd;
  private String name;
  private String email;
  private String phone;
  private String loc;
  private String regdate;
  private String grade;
}