package com.performance.module_1_116

class Feature116UseCase2(
    private val repository: Feature116Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
