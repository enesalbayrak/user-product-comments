package com.example.userproductcomments.dto.request;

import com.example.userproductcomments.entity.Product;
import com.example.userproductcomments.entity.User;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;
@Data
public class ProductCommentRequest {
    private String comment;
    private Date commentDate;
    private long product_id;
    private long user_id;
}
