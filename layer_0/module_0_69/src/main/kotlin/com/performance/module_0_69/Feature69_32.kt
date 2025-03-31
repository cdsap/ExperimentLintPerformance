package com.performance.module_0_69

class Feature69UseCase0(
    private val repository: Feature69Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
