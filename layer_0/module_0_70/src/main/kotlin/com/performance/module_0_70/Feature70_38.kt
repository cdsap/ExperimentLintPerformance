package com.performance.module_0_70

class Feature70UseCase2(
    private val repository: Feature70Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
