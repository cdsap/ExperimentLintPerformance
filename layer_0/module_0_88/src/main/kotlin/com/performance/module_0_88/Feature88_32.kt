package com.performance.module_0_88

class Feature88UseCase0(
    private val repository: Feature88Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
