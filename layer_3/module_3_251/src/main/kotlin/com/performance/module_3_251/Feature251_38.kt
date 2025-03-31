package com.performance.module_3_251

class Feature251UseCase2(
    private val repository: Feature251Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
