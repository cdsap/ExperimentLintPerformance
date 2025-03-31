package com.performance.module_3_174

class Feature174UseCase2(
    private val repository: Feature174Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
