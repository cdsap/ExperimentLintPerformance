package com.performance.module_1_117

class Feature117UseCase0(
    private val repository: Feature117Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
