package com.performance.module_1_136

class Feature136UseCase1(
    private val repository: Feature136Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
