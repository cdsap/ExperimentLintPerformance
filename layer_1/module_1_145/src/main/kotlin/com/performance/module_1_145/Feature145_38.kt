package com.performance.module_1_145

class Feature145UseCase2(
    private val repository: Feature145Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
