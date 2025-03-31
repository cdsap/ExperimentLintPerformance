package com.performance.module_0_17

class Feature17UseCase1(
    private val repository: Feature17Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
