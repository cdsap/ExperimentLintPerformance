package com.performance.module_0_75

class Feature75UseCase2(
    private val repository: Feature75Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
