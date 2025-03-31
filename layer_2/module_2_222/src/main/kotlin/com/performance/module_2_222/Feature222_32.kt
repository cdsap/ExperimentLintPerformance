package com.performance.module_2_222

class Feature222UseCase0(
    private val repository: Feature222Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
