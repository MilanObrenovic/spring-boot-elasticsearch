package org.example.demo.model;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Data
public class OwnerModel {

    @Field(type = FieldType.Text, name = "name")
    private String name;

    @Field(type = FieldType.Integer, name = "age")
    private Integer age;

    @Field(type = FieldType.Boolean, name = "is_active")
    private Boolean isActive;

}
