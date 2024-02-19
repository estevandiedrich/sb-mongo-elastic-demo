package io.github.cepr0.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableReactiveElasticsearchRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@EnableMongoRepositories("io.github.cepr0.demo.repo.mongo")
@EnableReactiveElasticsearchRepositories("io.github.cepr0.demo.repo.elastic")
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
//
//	@Bean
//	MongoTransactionManager transactionManager(MongoDbFactory dbFactory) {
//		return new MongoTransactionManager(dbFactory);
//	}

//	@EventListener(ApplicationReadyEvent.class)
//	public void onReady() {
//
//		if (mongoTemplate.collectionExists(Person.class)) {
//			mongoTemplate.dropCollection(Person.class);
//		}
//		mongoTemplate.createCollection(Person.class);
//
//		if (mongoTemplate.collectionExists(Car.class)) {
//			mongoTemplate.dropCollection(Car.class);
//		}
//		mongoTemplate.createCollection(Car.class);
//
//		if (elasticsearchTemplate.indexExists(ElasticPerson.class)) {
//			elasticsearchTemplate.deleteIndex(ElasticPerson.class);
//		}
//		elasticsearchTemplate.createIndex(ElasticPerson.class);
//
//		if (elasticsearchTemplate.indexExists(ElasticCar.class)) {
//			elasticsearchTemplate.deleteIndex(ElasticCar.class);
//		}
//		elasticsearchTemplate.createIndex(ElasticCar.class);
//	}
}
