package com.performance.module_3_171

class Feature171UseCase2(
    private val repository: Feature171Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
