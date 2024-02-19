package io.github.cepr0.demo.model.elastic;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

//@ContentAlias("cars")
//@Data
//@EqualsAndHashCode(callSuper = true)
@Document(indexName = "car")
public class ElasticCar {
	@Id
	private String id;
	@Field(type = FieldType.Text, name = "brand")
	private String brand;
	@Field(type = FieldType.Text, name = "model")
	private String model;
	@Field(type = FieldType.Text, name = "year")
	private Integer year;
}
