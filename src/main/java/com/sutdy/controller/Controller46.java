package com.sutdy.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

//@Controller
//@ResponseBody //모든 메서드에 적용
@RestController
@RequestMapping("/api/main46")
public class Controller46 {

    @PostMapping("/sub1")
    public String sub1(@RequestParam(value = "name") String name, @RequestParam("file") MultipartFile file) throws Exception {

        System.out.println("name = " + name);
        System.out.println("file.getOriginalFilename()" + file.getOriginalFilename());
        System.out.println("file.getSize()" + file.getSize());

        String path = "/Users/igyeyeong/Desktop/temps/" + file.getOriginalFilename();
        file.transferTo(new File(path));

        return null;
    }

    @PostMapping("/sub2")
    public String sub2(@RequestParam("name") String name, @RequestParam("file[]") MultipartFile[] file) throws Exception {

        System.out.println("name = " + name);
        if (file != null && file.length > 0) {
            for (int i = 0; i < file.length; i++) {

                String path = "/Users/igyeyeong/Desktop/temps/" + file[i].getOriginalFilename();
                file[i].transferTo(new File(path));
            }
        }
        return null;
    }
}
