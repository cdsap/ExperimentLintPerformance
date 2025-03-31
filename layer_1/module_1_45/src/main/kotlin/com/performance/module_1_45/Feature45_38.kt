package com.performance.module_1_45

class Feature45UseCase2(
    private val repository: Feature45Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
