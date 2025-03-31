package com.performance.module_0_72

class Feature72UseCase2(
    private val repository: Feature72Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
