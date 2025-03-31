package com.performance.module_2_222

class Feature222UseCase2(
    private val repository: Feature222Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
