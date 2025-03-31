package com.performance.module_0_130

class Feature130UseCase0(
    private val repository: Feature130Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
