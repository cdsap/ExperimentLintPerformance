package com.performance.module_0_17

class Feature17UseCase0(
    private val repository: Feature17Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
