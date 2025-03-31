package com.performance.module_0_40

class Feature40UseCase0(
    private val repository: Feature40Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
