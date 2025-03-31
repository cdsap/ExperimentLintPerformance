package com.performance.module_3_271

class Feature271UseCase2(
    private val repository: Feature271Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
