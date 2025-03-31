package com.performance.module_0_27

class Feature27UseCase2(
    private val repository: Feature27Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
