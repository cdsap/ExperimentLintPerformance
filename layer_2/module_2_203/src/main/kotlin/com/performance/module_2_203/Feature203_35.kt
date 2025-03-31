package com.performance.module_2_203

class Feature203UseCase1(
    private val repository: Feature203Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
