package io.github.cepr0.demo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.cepr0.crud.api.OnUpdate;
import io.github.cepr0.demo.dto.CarResponse;
import io.github.cepr0.demo.model.Car;
import io.github.cepr0.demo.model.elastic.ElasticCar;
import io.github.cepr0.demo.repo.elastic.CarElasticRepo;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("cars")
public class CarController /*extends AbstractCrudController<Car, String, CarRequest, CarResponse>*/ {

	@Autowired
	CarElasticRepo carElasticRepo;
//	public CarController(final CarService service) {
//		super(service);
//	}

	@PostMapping
	public Mono<ElasticCar> create(@RequestBody ElasticCar request) {
		return carElasticRepo.save(request);
	}

	@PatchMapping("/{id}")
	@Override
	public ResponseEntity<CarResponse> update(@PathVariable("id") final String id, @Validated(OnUpdate.class) @RequestBody final CarRequest request) {
		return super.update(id, request);
	}

	@DeleteMapping("/{id}")
	@Override
	public ResponseEntity<?> delete(@PathVariable("id") final String id) {
		return super.delete(id);
	}

	@GetMapping("/{id}")
	@Override
	public ResponseEntity<CarResponse> getOne(@PathVariable("id") final String id) {
		return super.getOne(id);
	}

	@GetMapping
	@Override
	public ResponseEntity<List<CarResponse>> getAll() {
		return super.getAll();
	}
}
