package com.performance.module_3_174

class Feature174UseCase1(
    private val repository: Feature174Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
