package com.performance.module_1_116

class Feature116UseCase1(
    private val repository: Feature116Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
