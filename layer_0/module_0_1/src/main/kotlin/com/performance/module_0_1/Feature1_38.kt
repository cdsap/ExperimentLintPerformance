package com.performance.module_0_1

class Feature1UseCase2(
    private val repository: Feature1Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
