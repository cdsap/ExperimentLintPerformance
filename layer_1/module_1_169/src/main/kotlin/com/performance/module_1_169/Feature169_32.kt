package com.performance.module_1_169

class Feature169UseCase0(
    private val repository: Feature169Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
