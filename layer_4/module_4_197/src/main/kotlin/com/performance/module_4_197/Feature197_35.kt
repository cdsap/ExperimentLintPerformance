package com.performance.module_4_197

class Feature197UseCase1(
    private val repository: Feature197Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
