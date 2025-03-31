package com.performance.module_4_189

class Feature189UseCase0(
    private val repository: Feature189Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
