package com.performance.module_3_250

class Feature250UseCase0(
    private val repository: Feature250Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
