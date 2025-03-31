package com.performance.module_2_240

class Feature240UseCase0(
    private val repository: Feature240Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
