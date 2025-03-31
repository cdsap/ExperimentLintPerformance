package com.performance.module_3_256

class Feature256UseCase2(
    private val repository: Feature256Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
