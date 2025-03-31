package com.performance.module_1_197

class Feature197UseCase0(
    private val repository: Feature197Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
