package com.qqinshaowu.basic.project.system.iot.product;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 整合测试swagger文档
 *
 * @author: qqinshaowu
 * @since: 2.1.0
 */
@Tag(name = "这是名字",description = "这是描述")
@RestController
@RequestMapping(value = "/product")
public class ProductController {


    @Operation(
            summary = "新增产品接口",
            description = """
            新增产品接口;
            """
    )
    @PostMapping()
    public void addProduct( ){
        System.out.println("整合swagger嘞嘿嘿嘿！~");
    }



}
