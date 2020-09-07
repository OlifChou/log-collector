package com.sun.bean;

import lombok.Data;

@Data
public class AppErrorLog {
    private String errorBrief;    //错误摘要
    private String errorDetail;   //错误详情

}
