package com.qf.po;

import lombok.Data;

import java.io.Serializable;
@Data
public class Dept implements Serializable {
    private Integer depid;
    private String depname;
    private String depposition;
    private String date;
    private String imageUrl;
    private Integer flag;
}
