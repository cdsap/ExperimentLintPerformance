package com.performance.module_3_66

class Feature66UseCase1(
    private val repository: Feature66Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
