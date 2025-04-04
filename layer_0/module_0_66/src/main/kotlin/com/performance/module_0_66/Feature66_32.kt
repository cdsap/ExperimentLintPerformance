package com.performance.module_0_66

class Feature66UseCase0(
    private val repository: Feature66Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
