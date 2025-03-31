package com.performance.module_0_62

class Feature62UseCase2(
    private val repository: Feature62Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
