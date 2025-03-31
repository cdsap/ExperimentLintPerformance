package com.performance.module_3_251

class Feature251UseCase1(
    private val repository: Feature251Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
