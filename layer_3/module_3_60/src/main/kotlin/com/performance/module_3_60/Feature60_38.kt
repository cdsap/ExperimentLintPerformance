package com.performance.module_3_60

class Feature60UseCase2(
    private val repository: Feature60Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
