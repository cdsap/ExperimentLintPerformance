package com.performance.module_1_146

class Feature146UseCase0(
    private val repository: Feature146Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
