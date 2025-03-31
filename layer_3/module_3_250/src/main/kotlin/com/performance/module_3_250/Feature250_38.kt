package com.performance.module_3_250

class Feature250UseCase2(
    private val repository: Feature250Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
