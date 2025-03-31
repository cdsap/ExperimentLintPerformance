package com.performance.module_0_40

class Feature40UseCase1(
    private val repository: Feature40Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
