package com.performance.module_1_91

class Feature91UseCase0(
    private val repository: Feature91Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
