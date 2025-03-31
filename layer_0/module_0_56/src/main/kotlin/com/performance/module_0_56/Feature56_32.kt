package com.performance.module_0_56

class Feature56UseCase0(
    private val repository: Feature56Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
