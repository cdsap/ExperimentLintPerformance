package com.performance.module_1_45

class Feature45UseCase0(
    private val repository: Feature45Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
