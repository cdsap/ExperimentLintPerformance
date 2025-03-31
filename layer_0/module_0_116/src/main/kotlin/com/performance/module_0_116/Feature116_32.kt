package com.performance.module_0_116

class Feature116UseCase0(
    private val repository: Feature116Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
