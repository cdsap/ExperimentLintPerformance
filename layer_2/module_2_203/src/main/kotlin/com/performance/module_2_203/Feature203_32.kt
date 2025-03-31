package com.performance.module_2_203

class Feature203UseCase0(
    private val repository: Feature203Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
