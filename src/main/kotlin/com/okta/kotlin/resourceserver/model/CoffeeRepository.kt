package com.okta.kotlin.resourceserver.model

import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "coffeeshops", path = "coffeeshops")
interface CoffeeRepository : CrudRepository<CoffeeShopModel, Long> {
}