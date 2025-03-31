package com.performance.module_0_45

class Feature45UseCase2(
    private val repository: Feature45Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
