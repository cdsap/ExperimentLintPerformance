package com.performance.module_0_35

class Feature35UseCase2(
    private val repository: Feature35Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
