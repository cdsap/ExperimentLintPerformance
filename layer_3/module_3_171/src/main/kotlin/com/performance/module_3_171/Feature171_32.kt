package com.performance.module_3_171

class Feature171UseCase0(
    private val repository: Feature171Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
