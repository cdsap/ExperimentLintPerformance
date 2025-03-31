package com.performance.module_1_195

class Feature195UseCase2(
    private val repository: Feature195Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
