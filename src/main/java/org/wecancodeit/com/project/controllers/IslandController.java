package org.wecancodeit.com.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.com.project.repositories.IslandRepository;

import javax.annotation.Resource;

@Controller
public class IslandController {

    @Resource
    private IslandRepository islandRepo;

    @RequestMapping("/")
    public String homepage() {
        return "home";
    }

   @RequestMapping("/islands")
   public String findAllIslands(Model model) {
       model.addAttribute("islandsModel", islandRepo.findAll());
    return "islandsTemplate";
 }

}


