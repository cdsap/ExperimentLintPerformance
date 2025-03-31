package com.performance.module_0_31

class Feature31UseCase2(
    private val repository: Feature31Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
