package com.example.thymeleaf.Controller;

import com.example.thymeleaf.Repository.ArmyRepo;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

  ArmyRepo repo = new ArmyRepo();

  @GetMapping("/")
  public String index(Model model){

    //ArrayList fra Database -> repr -> service

    // Model = mælkekaton
    model.addAttribute("name", "Jon");
    model.addAttribute("age",20);
    model.addAttribute("soldierList",repo.getAll());

    return "index";
  }

}
