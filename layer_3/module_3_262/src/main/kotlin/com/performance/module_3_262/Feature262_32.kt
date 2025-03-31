package com.performance.module_3_262

class Feature262UseCase0(
    private val repository: Feature262Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
