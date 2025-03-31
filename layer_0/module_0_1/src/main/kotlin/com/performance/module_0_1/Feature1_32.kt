package com.performance.module_0_1

class Feature1UseCase0(
    private val repository: Feature1Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
