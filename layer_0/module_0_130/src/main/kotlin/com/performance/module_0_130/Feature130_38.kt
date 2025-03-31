package com.performance.module_0_130

class Feature130UseCase2(
    private val repository: Feature130Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
