package com.performance.module_5_301

class Feature301UseCase1(
    private val repository: Feature301Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
