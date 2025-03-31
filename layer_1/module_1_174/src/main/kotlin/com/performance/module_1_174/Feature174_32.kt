package com.performance.module_1_174

class Feature174UseCase0(
    private val repository: Feature174Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
