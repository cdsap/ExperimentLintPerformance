package com.performance.module_4_278

class Feature278UseCase0(
    private val repository: Feature278Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
