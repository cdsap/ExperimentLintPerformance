package com.performance.module_0_42

class Feature42UseCase2(
    private val repository: Feature42Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
