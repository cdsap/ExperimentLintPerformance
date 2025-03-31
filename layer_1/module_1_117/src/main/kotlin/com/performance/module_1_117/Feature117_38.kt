package com.performance.module_1_117

class Feature117UseCase2(
    private val repository: Feature117Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
