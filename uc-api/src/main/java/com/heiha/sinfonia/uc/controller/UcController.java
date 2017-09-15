package com.heiha.sinfonia.uc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <br>
 * <b>Project:</b> uc<br>
 * <b>Date:</b> 2017/9/12 9:22<br>
 * <b>Author:</b> heiha<br>
 */
@EnableConfigurationProperties(UcProperties.class)
@RestController
public class UcController {
    @Autowired
    private UcProperties ucProperties;

    @GetMapping("/uc/info")
    public String info() {
        return ucProperties.getInfo();
    }
}
