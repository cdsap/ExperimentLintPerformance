package com.performance.module_3_60

class Feature60UseCase0(
    private val repository: Feature60Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
