package com.performance.module_3_262

class Feature262UseCase2(
    private val repository: Feature262Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
