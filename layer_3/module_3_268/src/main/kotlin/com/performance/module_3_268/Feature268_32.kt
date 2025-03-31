package com.performance.module_3_268

class Feature268UseCase0(
    private val repository: Feature268Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
