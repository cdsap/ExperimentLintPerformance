package com.performance.module_5_301

class Feature301UseCase0(
    private val repository: Feature301Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
