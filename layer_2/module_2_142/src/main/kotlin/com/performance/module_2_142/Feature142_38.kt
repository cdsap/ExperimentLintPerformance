package com.performance.module_2_142

class Feature142UseCase2(
    private val repository: Feature142Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
