package com.okta.kotlin.resourceserver

import com.okta.kotlin.resourceserver.model.CoffeeShopModel
import org.springframework.context.annotation.Configuration
import org.springframework.data.rest.core.config.RepositoryRestConfiguration
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer

@Configuration
class RestConfiguration : RepositoryRestConfigurer {
    override fun configureRepositoryRestConfiguration(config : RepositoryRestConfiguration?){
        config?.exposeIdsFor(CoffeeShopModel::class.java)
        config?.setBasePath("/api")
    }
}