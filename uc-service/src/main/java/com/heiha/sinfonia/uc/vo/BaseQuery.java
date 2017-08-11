package com.heiha.sinfonia.uc.vo;

import com.heiha.sinfonia.uc.pojo.Pagination;
import lombok.Data;

import java.util.Date;

/**
 * <br>
 * <b>Project:</b> uc<br>
 * <b>Date:</b> 2017/8/9 16:42<br>
 * <b>Author:</b> heiha<br>
 */
@Data
public class BaseQuery extends Pagination {
    private Integer createUserId;

    private Integer updateUserId;

    private Date createTimeStart;

    private Date updateTimeStart;

    private Date createTimeEnd;

    private Date updateTimeEnd;

    private String note;
}
