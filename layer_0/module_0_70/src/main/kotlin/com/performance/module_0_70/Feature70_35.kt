package com.performance.module_0_70

class Feature70UseCase1(
    private val repository: Feature70Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
