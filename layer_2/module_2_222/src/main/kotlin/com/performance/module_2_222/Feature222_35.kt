package com.performance.module_2_222

class Feature222UseCase1(
    private val repository: Feature222Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
