package io.github.cepr0.demo.model.elastic;

import io.github.cepr0.crud.model.ContentAlias;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.elasticsearch.annotations.Document;

@ContentAlias("people")
@Data
@EqualsAndHashCode(callSuper = true)
@Document(indexName = "person")
public class ElasticPerson extends BaseElasticEntity {
	private static final long serialVersionUID = 5507393131388079567L;
	private String name;
}
