package com.performance.module_0_6

class Feature6UseCase1(
    private val repository: Feature6Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
