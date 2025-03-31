package com.performance.module_3_268

class Feature268UseCase2(
    private val repository: Feature268Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
