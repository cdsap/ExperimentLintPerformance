package com.performance.module_3_66

class Feature66UseCase2(
    private val repository: Feature66Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
