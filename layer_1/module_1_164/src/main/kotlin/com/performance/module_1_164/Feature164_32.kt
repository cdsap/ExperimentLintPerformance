package com.performance.module_1_164

class Feature164UseCase0(
    private val repository: Feature164Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
