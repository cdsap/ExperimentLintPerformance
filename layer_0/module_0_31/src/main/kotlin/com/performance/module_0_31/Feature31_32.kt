package com.performance.module_0_31

class Feature31UseCase0(
    private val repository: Feature31Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
