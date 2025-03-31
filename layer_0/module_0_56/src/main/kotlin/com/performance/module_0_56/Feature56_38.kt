package com.performance.module_0_56

class Feature56UseCase2(
    private val repository: Feature56Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
