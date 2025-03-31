package com.performance.module_5_301

class Feature301UseCase2(
    private val repository: Feature301Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
