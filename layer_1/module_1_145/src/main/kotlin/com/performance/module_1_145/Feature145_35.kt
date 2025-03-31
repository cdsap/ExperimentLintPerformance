package com.performance.module_1_145

class Feature145UseCase1(
    private val repository: Feature145Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
