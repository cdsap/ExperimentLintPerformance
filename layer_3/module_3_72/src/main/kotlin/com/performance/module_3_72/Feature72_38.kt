package com.performance.module_3_72

class Feature72UseCase2(
    private val repository: Feature72Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
