package com.performance.module_0_47

class Feature47UseCase0(
    private val repository: Feature47Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
