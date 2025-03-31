package com.performance.module_1_136

class Feature136UseCase2(
    private val repository: Feature136Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
