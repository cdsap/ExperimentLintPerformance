package com.performance.module_3_262

class Feature262UseCase1(
    private val repository: Feature262Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
