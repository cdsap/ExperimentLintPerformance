package com.performance.module_4_278

class Feature278UseCase2(
    private val repository: Feature278Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
