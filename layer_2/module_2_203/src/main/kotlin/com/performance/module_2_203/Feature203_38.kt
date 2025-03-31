package com.performance.module_2_203

class Feature203UseCase2(
    private val repository: Feature203Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
