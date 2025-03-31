package com.performance.module_0_17

class Feature17UseCase2(
    private val repository: Feature17Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
