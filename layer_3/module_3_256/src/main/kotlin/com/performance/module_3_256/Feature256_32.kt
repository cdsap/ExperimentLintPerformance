package com.performance.module_3_256

class Feature256UseCase0(
    private val repository: Feature256Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
