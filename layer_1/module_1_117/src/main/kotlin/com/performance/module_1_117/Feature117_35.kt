package com.performance.module_1_117

class Feature117UseCase1(
    private val repository: Feature117Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
