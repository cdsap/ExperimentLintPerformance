package com.performance.module_0_35

class Feature35UseCase1(
    private val repository: Feature35Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
