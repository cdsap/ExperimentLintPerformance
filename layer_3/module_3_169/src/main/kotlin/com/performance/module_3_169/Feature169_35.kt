package com.performance.module_3_169

class Feature169UseCase1(
    private val repository: Feature169Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
