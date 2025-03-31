package com.performance.module_0_35

class Feature35UseCase0(
    private val repository: Feature35Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
