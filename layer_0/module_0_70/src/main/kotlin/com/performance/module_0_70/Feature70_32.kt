package com.performance.module_0_70

class Feature70UseCase0(
    private val repository: Feature70Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
