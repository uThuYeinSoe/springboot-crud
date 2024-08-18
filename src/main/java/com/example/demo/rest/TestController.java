package com.example.demo.rest;

import com.example.demo.entity.News;
import com.example.demo.service.NewServices;
import com.example.demo.service.NewsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blogs")
public class TestController {
    private NewServices newServices;

    @Autowired
    public TestController(NewServices newServices){
        this.newServices = newServices;
    }

    @GetMapping("/news")
    public List<News> getAllNews(){
        List<News> allNews =newServices.getAllNews();
        System.out.println("Hello World");
        return allNews;
    }

    @PostMapping("/news")
    public News createNews(@RequestBody News news){
        System.out.println("Hello World");
        News returnNews = newServices.createNews(news);
        return returnNews;
    }
}
