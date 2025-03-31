package com.performance.module_0_40

class Feature40UseCase2(
    private val repository: Feature40Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
