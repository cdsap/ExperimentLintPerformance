package com.performance.module_0_7

class Feature7UseCase0(
    private val repository: Feature7Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
