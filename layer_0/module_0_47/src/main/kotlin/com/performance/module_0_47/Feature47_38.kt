package com.performance.module_0_47

class Feature47UseCase2(
    private val repository: Feature47Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
