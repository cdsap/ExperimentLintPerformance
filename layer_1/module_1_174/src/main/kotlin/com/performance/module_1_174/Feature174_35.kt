package com.performance.module_1_174

class Feature174UseCase1(
    private val repository: Feature174Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
