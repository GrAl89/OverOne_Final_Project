package com.OverOne.Final_Project_Grechikhin.Blog.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


    @Controller
    public class MainController {

        @GetMapping("/")
        public String greeting(Model model) {
            model.addAttribute("title", "Главная страница блога");
            return "home_page";
        }

        @GetMapping("/blog/about")
        public String showBlogAbout () {
            return "blog_about_page";
        }

    }

