package com.performance.module_1_175

class Feature175UseCase2(
    private val repository: Feature175Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
