package com.performance.module_4_197

class Feature197UseCase2(
    private val repository: Feature197Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
