package com.performance.module_0_62

class Feature62UseCase1(
    private val repository: Feature62Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
