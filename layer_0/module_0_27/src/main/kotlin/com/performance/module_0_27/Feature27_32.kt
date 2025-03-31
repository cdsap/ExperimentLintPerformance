package com.performance.module_0_27

class Feature27UseCase0(
    private val repository: Feature27Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
