package com.performance.module_1_174

class Feature174UseCase2(
    private val repository: Feature174Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
