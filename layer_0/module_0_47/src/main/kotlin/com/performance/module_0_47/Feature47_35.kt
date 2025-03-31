package com.performance.module_0_47

class Feature47UseCase1(
    private val repository: Feature47Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
