package com.example.thymeleaf.Repository;

import java.util.ArrayList;
import java.util.List;

public class ArmyRepo {
  private List<String> soldiers = new ArrayList<>();

  public ArmyRepo(){
    soldiers.add("Test");
    soldiers.add("Testington");
  }


  public List<String> getAll(){
    return soldiers;
  }
}
