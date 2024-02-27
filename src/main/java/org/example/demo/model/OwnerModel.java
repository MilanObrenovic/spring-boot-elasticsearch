package org.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Data
public class OwnerModel {

    @JsonProperty(value = "name")
    @Field(type = FieldType.Text, name = "name")
    private String name;

    @JsonProperty(value = "age")
    @Field(type = FieldType.Integer, name = "age")
    private Integer age;

    @JsonProperty(value = "is_active")
    @Field(type = FieldType.Boolean, name = "is_active")
    private Boolean isActive;

}
