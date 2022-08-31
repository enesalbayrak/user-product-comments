package com.example.userproductcomments.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
@Data
public class ProductRequest {
    private String name;
    private double price;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date stk;
}
