package com.performance.module_0_33

class Feature33UseCase0(
    private val repository: Feature33Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
