package com.performance.module_1_46

class Feature46UseCase0(
    private val repository: Feature46Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
