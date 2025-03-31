package com.performance.module_2_240

class Feature240UseCase1(
    private val repository: Feature240Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
