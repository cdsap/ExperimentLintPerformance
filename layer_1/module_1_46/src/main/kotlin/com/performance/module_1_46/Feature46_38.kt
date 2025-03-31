package com.performance.module_1_46

class Feature46UseCase2(
    private val repository: Feature46Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
