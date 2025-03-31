package com.performance.module_4_278

class Feature278UseCase1(
    private val repository: Feature278Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
