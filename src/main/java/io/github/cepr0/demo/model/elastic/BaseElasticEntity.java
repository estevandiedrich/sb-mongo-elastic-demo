package io.github.cepr0.demo.model.elastic;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;

import java.io.Serializable;

@Getter
@Setter
public abstract class BaseElasticEntity implements Serializable {

	private static final long serialVersionUID = 3486346548377930861L;

	@Id
	private String id;

	@JsonIgnore
	@Version
	private Long version;
}
