package com.performance.module_0_69

class Feature69UseCase1(
    private val repository: Feature69Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
