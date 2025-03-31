package com.performance.module_3_174

class Feature174UseCase0(
    private val repository: Feature174Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
