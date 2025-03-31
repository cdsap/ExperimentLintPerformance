package com.performance.module_0_88

class Feature88UseCase2(
    private val repository: Feature88Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
