package com.performance.module_0_99

class Feature99UseCase2(
    private val repository: Feature99Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
