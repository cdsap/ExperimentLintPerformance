package com.performance.module_1_91

class Feature91UseCase1(
    private val repository: Feature91Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
