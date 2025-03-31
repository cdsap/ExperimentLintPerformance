package com.performance.module_1_136

class Feature136UseCase0(
    private val repository: Feature136Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
