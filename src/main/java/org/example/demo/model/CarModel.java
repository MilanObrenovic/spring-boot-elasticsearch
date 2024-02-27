package org.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.List;

@Data
@Document(indexName = "carindex")
public class CarModel {

    @Id
    @JsonProperty(value = "id")
    private String id;

    @JsonProperty(value = "model")
    @Field(type = FieldType.Text, name = "model")
    private String model;

    @JsonProperty(value = "year_of_manufacture")
    @Field(type = FieldType.Integer, name = "year_of_manufacture")
    private Integer yearOfManufacture;

    @JsonProperty(value = "brand")
    @Field(type = FieldType.Text, name = "brand")
    private String brand;

    @JsonProperty(value = "owners")
    @Field(type = FieldType.Nested, name = "owners")
    private List<OwnerModel> owners;

}
