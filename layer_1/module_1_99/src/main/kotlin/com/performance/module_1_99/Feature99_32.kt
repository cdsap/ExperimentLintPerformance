package com.performance.module_1_99

class Feature99UseCase0(
    private val repository: Feature99Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
