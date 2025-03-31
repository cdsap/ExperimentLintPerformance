package com.performance.module_2_142

class Feature142UseCase0(
    private val repository: Feature142Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
