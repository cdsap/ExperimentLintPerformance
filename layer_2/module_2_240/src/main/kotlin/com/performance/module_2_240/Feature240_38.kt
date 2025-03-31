package com.performance.module_2_240

class Feature240UseCase2(
    private val repository: Feature240Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
