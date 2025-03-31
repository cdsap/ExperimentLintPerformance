package com.performance.module_0_62

class Feature62UseCase0(
    private val repository: Feature62Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
