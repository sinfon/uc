package com.heiha.sinfonia.uc.controller;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * <br>
 * <b>Project:</b> uc<br>
 * <b>Date:</b> 2017/9/12 16:05<br>
 * <b>Author:</b> heiha<br>
 */
@Data
@ConfigurationProperties(prefix = "sinfonia.uc")
public class UcProperties {
    private String info;
}
