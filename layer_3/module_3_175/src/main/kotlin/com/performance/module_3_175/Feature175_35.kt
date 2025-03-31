package com.performance.module_3_175

class Feature175UseCase1(
    private val repository: Feature175Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
