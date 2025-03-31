package com.performance.module_3_251

class Feature251UseCase0(
    private val repository: Feature251Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
