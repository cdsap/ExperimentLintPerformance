package com.performance.module_3_256

class Feature256UseCase1(
    private val repository: Feature256Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
