package com.performance.module_1_91

class Feature91UseCase2(
    private val repository: Feature91Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
