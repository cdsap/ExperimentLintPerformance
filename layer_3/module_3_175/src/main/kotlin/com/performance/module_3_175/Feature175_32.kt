package com.performance.module_3_175

class Feature175UseCase0(
    private val repository: Feature175Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
