package com.performance.module_2_136

class Feature136UseCase2(
    private val repository: Feature136Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
