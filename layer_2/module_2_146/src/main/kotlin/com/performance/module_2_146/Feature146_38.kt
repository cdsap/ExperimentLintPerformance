package com.performance.module_2_146

class Feature146UseCase2(
    private val repository: Feature146Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
