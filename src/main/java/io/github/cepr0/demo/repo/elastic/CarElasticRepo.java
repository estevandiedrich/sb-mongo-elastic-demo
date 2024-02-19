package io.github.cepr0.demo.repo.elastic;

import io.github.cepr0.demo.model.elastic.ElasticCar;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarElasticRepo extends ReactiveCrudRepository<ElasticCar, String> {
}
